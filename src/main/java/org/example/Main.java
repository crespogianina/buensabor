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

        //PAIS
        Pais pais1 = Pais.builder().nombre("Argentina").build();
        Pais pais2 = Pais.builder().nombre("Chile").build();

        //PROVINCIA
        Provincia provincia1 = Provincia.builder().nombre("Mendoza").pais(pais1).build();
        Provincia provincia2 = new Provincia("Santiago", pais2);

        //LOCALIDAD
        Localidad localidad1 = Localidad.builder().nombre("Guaymallen").provincia(provincia1).build();
        Localidad localidad2 = Localidad.builder().nombre("Proviencia").provincia(provincia2).build();

        //DOMICILIO
        Domicilio domicilio1 = Domicilio.builder().calle("Belgrano").numero(123).cp(5505).localidad(localidad1).build();
        Domicilio domicilio2 = Domicilio.builder().calle("Bolivar").numero(43).cp(204).localidad(localidad2).build();

        //CATEGORIA
        Categoria categoria1 = Categoria.builder().denominacion("Bebidas").build();
        Categoria categoria2 = Categoria.builder().denominacion("Comidas").build();

        //UNIDAD MEDIDA
        UnidadMedida um1 = UnidadMedida.builder().denominacion("Litros").build();
        UnidadMedida um2 = UnidadMedida.builder().denominacion("Unidades").build();


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


        //IMAGEN ARTICULO
        ImagenArticulo img1 = ImagenArticulo.builder().denominacion("promo_pizza.jpg").build();
        ImagenArticulo img2 = ImagenArticulo.builder().denominacion("promo_empanada.jpg").build();

        //ARTICULO INSUMO
        ArticuloInsumo insumo1harina = ArticuloInsumo.builder().precioCompra(150.0).stockActual(100).stockMaximo(300)
                .esParaElaborar(true).denominacion("Harina").precioVenta(250.0).build();
        ArticuloInsumo insumo11cervezacorona = ArticuloInsumo.builder().precioCompra(100.0).stockActual(20)
                .stockMaximo(40).esParaElaborar(false).denominacion("Cerveza corona 1 litro").precioVenta(200.0).build();


        //ARTICULO MANUFACTURADO
        ArticuloManufacturado manufacturado1 = ArticuloManufacturado.builder().denominacion("Pizza Napolitana")
                .precioVenta(1200.0).descripcion("Pizza con queso, tomate y oregano")
                .tiempoEstimadoMinutos(15).preparacion("Hornear a 220°C por 15 minutos").build();

        ArticuloManufacturado manufacturado2 = ArticuloManufacturado.builder().denominacion("Empanada de Carne")
                .precioVenta(100.0).descripcion("Empanada rellena de carne picada")
                .tiempoEstimadoMinutos(10).preparacion("Hornear a 200°C por 10 minutos").build();

        //ARTICULO MANUFACTURADO DETALLE
        //manufacturado1.addDetalle(3, insumo1harina);
        //manufacturado1.addDetalle(2, insumo11cervezacorona);
        //manufacturado2.addDetalle(1, insumo1harina);
        //manufacturado2.addDetalle(48, insumo11cervezacorona);

        //PEDIDO
        Pedido pedido1 = Pedido.builder().horaEstimadaFinalizacion(LocalTime.of(22, 0))
                .total(1600).totalCosto(1000).tipoEnvio(TipoEnvio.DELIVERY)
                .formaPago(FormaPago.MERCADO_PAGO).fechaPedido(LocalDate.of(2025, 5, 16)).build();

        Pedido pedido2 = Pedido.builder().horaEstimadaFinalizacion(LocalTime.of(21, 30))
                .total(1000).totalCosto(500).tipoEnvio(TipoEnvio.TAKE_AWAY)
                .formaPago(FormaPago.EFECTIVO).fechaPedido(LocalDate.of(2025, 5, 17)).build();

        //DETALLE PEDIDO
        DetallePedido detallePedido1 = DetallePedido.builder().cantidad(1).subTotal(1000).articulo(manufacturado1).build();
        DetallePedido detallePedido2 = DetallePedido.builder().cantidad(3).subTotal(600).articulo(insumo11cervezacorona).build();
        pedido1.addDetallePedido(detallePedido1);
        pedido1.addDetallePedido(detallePedido2);

        DetallePedido detallePedido3 = DetallePedido.builder().cantidad(6).subTotal(600).articulo(manufacturado2).build();
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


        System.out.println("-----------------PEDIDO 1-----------------");
        System.out.println(pedido1);
        System.out.println("-----------------PEDIDO 2-----------------");
        System.out.println(pedido2);

    }
}