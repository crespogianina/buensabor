package org.example;

import org.example.entities.*;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        //EMPRESA
        Empresa empresa1 = Empresa.builder().razonSocial("Arcor S.A").nombre("Arcor").cuil(43245).build();
        Empresa empresa2 = Empresa.builder().razonSocial("Pedidos Ya Inc").cuil(46537).nombre("Pedidos Ya").build();

        //SUCURSAL
        Sucursal sucursal1 = Sucursal.builder().nombre("Centro").horarioApertura(LocalTime.of(9, 00)).horarioCierre(LocalTime.of(17, 30)).build();
        Sucursal sucursal2 = Sucursal.builder().nombre("Sucursal 1").horarioApertura(LocalTime.of(18, 30)).horarioCierre(LocalTime.of(23, 59)).build();
        Sucursal sucursal3 = Sucursal.builder().nombre("Centro Este").horarioApertura(LocalTime.of(9, 00)).horarioCierre(LocalTime.of(17, 30)).build();
        Sucursal sucursal4 = Sucursal.builder().nombre("Sucursal 2").horarioApertura(LocalTime.of(18, 30)).horarioCierre(LocalTime.of(23, 59)).build();

        //PAIS
        Pais pais1 = Pais.builder().nombre("Argentina").build();
        Pais pais2 = Pais.builder().nombre("Chile").build();

        //PROVINCIA
        Provincia provincia1 = Provincia.builder().nombre("Mendoza").pais(pais1).build();
        Provincia provincia2 = new Provincia("Santiago", pais2);

        //LOCALIDAD
        Localidad localidad1 = Localidad.builder().nombre("Guaymallen").provincia(provincia1).build();
        Localidad localidad2 = Localidad.builder().nombre("Proviencia").provincia(provincia2).build();
        Localidad localidad3 = Localidad.builder().nombre("Godoy Cruz").provincia(provincia1).build();
        Localidad localidad4 = Localidad.builder().nombre("Ciudad").provincia(provincia1).build();

        //DOMICILIO
        Domicilio domicilio1 = Domicilio.builder().calle("Belgrano").numero(123).cp(5505).localidad(localidad1).build();
        Domicilio domicilio2 = Domicilio.builder().calle("Bolivar").numero(43).cp(204).localidad(localidad2).build();
        Domicilio domicilio3 = Domicilio.builder().calle("San Martin").numero(123).cp(5505).localidad(localidad3).build();
        Domicilio domicilio4 = Domicilio.builder().calle("Brasil").numero(43).cp(204).localidad(localidad4).build();


        sucursal1.setDomicilio(domicilio2);
        sucursal2.setDomicilio(domicilio1);
        sucursal3.setDomicilio(domicilio3);
        sucursal4.setDomicilio(domicilio4);

        empresa1.addSucursal(sucursal1);
        empresa1.addSucursal(sucursal2);

        empresa2.addSucursal(sucursal3);
        empresa2.addSucursal(sucursal4);


        //CATEGORIA
        Categoria categoria1 = Categoria.builder().denominacion("Bebidas").build();
        Categoria categoria2 = Categoria.builder().denominacion("Comidas").build();

        sucursal1.addCategoria(categoria1);
        sucursal1.addCategoria(categoria2);

        sucursal2.addCategoria(categoria1);
        sucursal2.addCategoria(categoria2);

        sucursal3.addCategoria(categoria2);

        sucursal4.addCategoria(categoria1);

        //PROMOCION
        Promocion promocion1 = Promocion.builder().denominacion("Jueves de Pizza")
                .fechaDesde(LocalDate.of(2025, 5, 30)).fechaHasta(LocalDate.of(2025, 6, 30))
                .horaDesde(LocalTime.of(12, 30)).horaHasta(LocalTime.of(22, 30))
                .descripcionDescuento("Descuento en pizzas los Jueves")
                .precioPromocional(60.0).tipoPromocion(TipoPromocion.promocion1).build();
        Promocion promocion2 = Promocion.builder().denominacion("Happy Hour")
                .fechaDesde(LocalDate.of(2025, 5, 30)).fechaHasta(LocalDate.of(2025, 6, 30))
                .horaDesde(LocalTime.of(21, 30)).horaHasta(LocalTime.of(22, 30))
                .descripcionDescuento("Descuento en bebidas")
                .precioPromocional(15.0).tipoPromocion(TipoPromocion.HappyHour).build();


        //IMAGEN PROMOCION
        ImagenPromocion imagenPromocion1 = ImagenPromocion.builder().denominacion("imagen_promocion_1.jpg").build();
        ImagenPromocion imagenPromocion2 = ImagenPromocion.builder().denominacion("imagen_promocion_2.jpg").build();

        promocion1.addImagenPromocion(imagenPromocion1);
        promocion2.addImagenPromocion(imagenPromocion2);

        sucursal1.addPromocion(promocion1);
        sucursal2.addPromocion(promocion2);
        sucursal3.addPromocion(promocion2);
        sucursal3.addPromocion(promocion1);
        sucursal4.addPromocion(promocion1);

        //UNIDAD MEDIDA
        UnidadMedida litros = UnidadMedida.builder().denominacion("Litros").build();
        UnidadMedida unidad = UnidadMedida.builder().denominacion("Unidades").build();
        UnidadMedida kilo = UnidadMedida.builder().denominacion("Unidades").build();
        UnidadMedida gramo = UnidadMedida.builder().denominacion("Unidades").build();

        //ARTICULO INSUMO
        ArticuloInsumo insumo1harina = ArticuloInsumo.builder().precioCompra(150.0).stockActual(100).stockMaximo(300)
                .esParaElaborar(true).denominacion("Harina").precioVenta(250.0).unidadMedida(kilo).build();
        ArticuloInsumo insumo1carne = ArticuloInsumo.builder().precioCompra(150.0).stockActual(100).stockMaximo(300)
                .esParaElaborar(true).denominacion("Harina").precioVenta(250.0).unidadMedida(kilo).build();
        ArticuloInsumo insumo1queso = ArticuloInsumo.builder().precioCompra(150.0).stockActual(100).stockMaximo(300)
                .esParaElaborar(true).denominacion("Harina").precioVenta(250.0).unidadMedida(gramo).build();
        ArticuloInsumo insumo1jamon = ArticuloInsumo.builder().precioCompra(150.0).stockActual(100).stockMaximo(300)
                .esParaElaborar(true).denominacion("Harina").precioVenta(250.0).unidadMedida(kilo).build();
        ArticuloInsumo insumo1cebolla = ArticuloInsumo.builder().precioCompra(150.0).stockActual(100).stockMaximo(300)
                .esParaElaborar(true).denominacion("Harina").precioVenta(250.0).unidadMedida(kilo).build();
        ArticuloInsumo insumo11cervezacorona = ArticuloInsumo.builder().precioCompra(100.0).stockActual(20)
                .stockMaximo(40).esParaElaborar(false).denominacion("Cerveza corona 1 litro").precioVenta(200.0).unidadMedida(unidad).build();
        ArticuloInsumo insumo11cocaCola1 = ArticuloInsumo.builder().precioCompra(100.0).stockActual(20)
                .stockMaximo(40).esParaElaborar(false).denominacion("Gaseosa Coca Cola 1.5 litro").precioVenta(200.0).unidadMedida(unidad).build();
        ArticuloInsumo insumo11cocaCola3 = ArticuloInsumo.builder().precioCompra(100.0).stockActual(20)
                .stockMaximo(40).esParaElaborar(false).denominacion("Gaseosa Coca Cola 3 litros").precioVenta(1000.0).unidadMedida(unidad).build();

        //ARTICULO MANUFACTURADO
        ArticuloManufacturado manufacturadoPizzaNap = ArticuloManufacturado.builder().denominacion("Pizza Napolitana")
                .precioVenta(1200.0).descripcion("Pizza con queso, tomate y oregano").unidadMedida(unidad)
                .tiempoEstimadoMinutos(15).preparacion("Hornear a 220°C por 15 minutos").build();

        ArticuloManufacturado manufacturadoPizzaFugazza = ArticuloManufacturado.builder().denominacion("Pizza Fugazza")
                .precioVenta(1200.0).descripcion("Pizza con queso, cebolla y oregano").unidadMedida(unidad)
                .tiempoEstimadoMinutos(15).preparacion("Hornear a 220°C por 15 minutos").build();

        ArticuloManufacturado manufacturadoPizzaJQ = ArticuloManufacturado.builder().denominacion("Pizza Especial")
                .precioVenta(1200.0).descripcion("Pizza con jamon, queso, morron y oregano").unidadMedida(unidad)
                .tiempoEstimadoMinutos(15).preparacion("Hornear a 220°C por 15 minutos").build();

        ArticuloManufacturado manufacturadoEmpCarne = ArticuloManufacturado.builder().denominacion("Empanada de Carne")
                .precioVenta(100.0).descripcion("Empanada rellena de carne picada").unidadMedida(unidad)
                .tiempoEstimadoMinutos(10).preparacion("Hornear a 200°C por 10 minutos").build();

        ArticuloManufacturado manufacturadoEmpJQ = ArticuloManufacturado.builder().denominacion("Empanada de Jamon y Queso")
                .precioVenta(100.0).descripcion("Empanada rellena de jamon y queso").unidadMedida(unidad)
                .tiempoEstimadoMinutos(10).preparacion("Hornear a 200°C por 10 minutos").build();

        ArticuloManufacturado manufacturadoEmpH = ArticuloManufacturado.builder().denominacion("Empanada de Humita")
                .precioVenta(100.0).descripcion("Empanada rellena de humita").unidadMedida(unidad)
                .tiempoEstimadoMinutos(10).preparacion("Hornear a 200°C por 10 minutos").build();

        ArticuloManufacturado manufacturadoEmpC = ArticuloManufacturado.builder().denominacion("Empanada de Capresse")
                .precioVenta(100.0).descripcion("Empanada rellena de capresse").unidadMedida(unidad)
                .tiempoEstimadoMinutos(10).preparacion("Hornear a 200°C por 10 minutos").build();

        //IMAGEN ARTICULO
        ImagenArticulo imgArticulo1 = ImagenArticulo.builder().denominacion("pizza_napolitana.jpg").build();
        ImagenArticulo imgArticulo2 = ImagenArticulo.builder().denominacion("empanada_carne.jpg").build();
        ImagenArticulo imgArticulo3 = ImagenArticulo.builder().denominacion("empanada_jamon_queso.jpg").build();
        ImagenArticulo imgArticulo4 = ImagenArticulo.builder().denominacion("empanada_capresse.jpg").build();
        ImagenArticulo imgArticulo5 = ImagenArticulo.builder().denominacion("empanada_humita.jpg").build();
        ImagenArticulo imgArticulo6 = ImagenArticulo.builder().denominacion("pizza_fugazza.jpg").build();
        ImagenArticulo imgArticulo7 = ImagenArticulo.builder().denominacion("pizza_jamos_queso.jpg").build();

        manufacturadoEmpJQ.addImagen(imgArticulo3);
        manufacturadoEmpC.addImagen(imgArticulo2);
        manufacturadoEmpH.addImagen(imgArticulo5);
        manufacturadoEmpC.addImagen(imgArticulo4);
        manufacturadoEmpCarne.addImagen(imgArticulo2);
        manufacturadoPizzaNap.addImagen(imgArticulo1);
        manufacturadoPizzaFugazza.addImagen(imgArticulo6);
        manufacturadoPizzaJQ.addImagen(imgArticulo7);

        //ARTICULO MANUFACTURADO DETALLE
        ArticuloManufacturadoDetalle detalleEmpanadasCar = ArticuloManufacturadoDetalle.builder().cantidad(1).insumo(insumo1carne).build();
        ArticuloManufacturadoDetalle detalleEmpanadasJamon = ArticuloManufacturadoDetalle.builder().cantidad(1).insumo(insumo1queso).build();
        ArticuloManufacturadoDetalle detallePizzaFugazza = ArticuloManufacturadoDetalle.builder().cantidad(1).insumo(insumo1cebolla).build();
        ArticuloManufacturadoDetalle detallePizzaNapolitana = ArticuloManufacturadoDetalle.builder().cantidad(1).insumo(insumo1harina).build();

        manufacturadoEmpCarne.addDetalle(detalleEmpanadasCar);
        manufacturadoEmpJQ.addDetalle(detalleEmpanadasJamon);
        manufacturadoPizzaFugazza.addDetalle(detallePizzaFugazza);
        manufacturadoPizzaNap.addDetalle(detallePizzaNapolitana);

        //PEDIDO
        Pedido pedido1 = Pedido.builder().horaEstimadaFinalizacion(LocalTime.of(22, 0))
                .total(1600).totalCosto(1000).tipoEnvio(TipoEnvio.DELIVERY)
                .formaPago(FormaPago.MERCADO_PAGO).estado(Estado.ENTREGADO).fechaPedido(LocalDate.of(2025, 5, 16)).build();

        Pedido pedido2 = Pedido.builder().horaEstimadaFinalizacion(LocalTime.of(21, 30))
                .total(1000).totalCosto(500).tipoEnvio(TipoEnvio.TAKE_AWAY).estado(Estado.ENTREGADO)
                .formaPago(FormaPago.EFECTIVO).fechaPedido(LocalDate.of(2025, 5, 17)).build();

        pedido1.setSucursal(sucursal1);
        pedido2.setSucursal(sucursal3);

        //DETALLE PEDIDO
        DetallePedido detallePedido1 = DetallePedido.builder().cantidad(1).subTotal(1000).articulo(manufacturadoEmpJQ).build();
        DetallePedido detallePedido2 = DetallePedido.builder().cantidad(3).subTotal(600).articulo(manufacturadoPizzaFugazza).build();
        pedido1.addDetallePedido(detallePedido1);
        pedido1.addDetallePedido(detallePedido2);

        DetallePedido detallePedido3 = DetallePedido.builder().cantidad(6).subTotal(600).articulo(manufacturadoPizzaNap).build();
        DetallePedido detallePedido4 = DetallePedido.builder().cantidad(1).subTotal(200).articulo(insumo11cervezacorona).build();
        pedido2.addDetallePedido(detallePedido3);
        pedido2.addDetallePedido(detallePedido4);

        //FACTURA
        Factura factura1 = Factura.builder().fechaFacturacion(LocalDate.of(2025, 5, 16)).mpPaymentId(4534)
                .mpMerchantOrderId(92340).mpPreferenceId("3045A").mpPaymentType("Efectivo")
                .formaPago(FormaPago.MERCADO_PAGO).totalVenta(1800.0).build();
        Factura factura2 = Factura.builder().fechaFacturacion(LocalDate.of(2025, 6, 2)).mpPaymentId(5567)
                .mpMerchantOrderId(1234).mpPreferenceId("5564").mpPaymentType("Mercado Pago")
                .formaPago(FormaPago.MERCADO_PAGO).totalVenta(1000.0).build();

        pedido1.setFactura(factura1);
        pedido2.setFactura(factura2);

        //USUARIO
        Usuario usuario1 = Usuario.builder().auth0Id("123").username("juancliente").build();
        Usuario usuario2 = Usuario.builder().auth0Id("456").username("adminuser").build();

        //CLIENTE
        Cliente cliente1 = Cliente.builder().nombre("Juan").apellido("Pérez").telefono("123456789")
                .email("juan@mail.com").fechaNacimiento(LocalDate.of(1990, 1, 1)).build();
        Cliente cliente2 = Cliente.builder().nombre("Ana").apellido("Gomez").telefono("987654321")
                .email("ana@mail.com").fechaNacimiento(LocalDate.of(2000, 2, 5)).build();

        //IMAGEN CLIENTE
        ImagenCliente imagenCliente1 = ImagenCliente.builder().denominacion("cliente_1.jpg").build();
        ImagenCliente imagenCliente2 = ImagenCliente.builder().denominacion("cliente_2.jpg").build();

        cliente1.setImagen(imagenCliente1);
        cliente2.setImagen(imagenCliente2);
        cliente1.setUsuario(usuario1);
        cliente2.setUsuario(usuario2);

        cliente1.addPedidos(pedido1);
        cliente2.addPedidos(pedido2);

        System.out.println("-----------------Usuario 1-----------------");
        System.out.println(usuario1);
        System.out.println("-----------------Usuario 2-----------------");
        System.out.println(usuario2);

    }
}