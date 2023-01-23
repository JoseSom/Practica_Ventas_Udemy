package com.gm.ventas;

public class Orden {
    private final static int MAX_PRODUCTS = 10;
    private final int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductosEnOrden;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductosEnOrden < Orden.MAX_PRODUCTS) {
            this.productos[this.contadorProductosEnOrden++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos:" + Orden.MAX_PRODUCTS);
        }
    }

    public double calcularTotal() {
        double suma = 0;
        for (Producto producto : productos) {
            if (producto != null) {
                suma += producto.getPrecio();
            }
        }
        return suma;
    }

    public void mostrarOrden() {
        for (Producto producto : productos) {
            if (producto != null) {
                System.out.println(producto);
            }
        }
    }

}
