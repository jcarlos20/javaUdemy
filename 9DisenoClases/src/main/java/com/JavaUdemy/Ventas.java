package com.JavaUdemy;

public class Ventas {
    public static void main(String[] args) {
        //Crear varios objetos de tipo producto
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalon", 100);

        //Crear objeto de tipo Orden
        Orden orden1 = new Orden();

        //Agregar los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        //Imprimir la orden
        orden1.mostrarOrden();
    }


}
