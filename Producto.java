/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private String categoria;
    private int stock;
    private String fotos;
 // Constructor con 7 parámetros
    public Producto(int idProducto, String nombre, String descripcion, double precio, String categoria, int stock, String fotos) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        this.fotos = fotos;
    }

    // Constructor con 6 parámetros
    public Producto(int idProducto, String nombre, String descripcion, double precio, String categoria, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
        this.fotos = "Por confirmar";
    }

    // Constructor con 5 parámetros
    public Producto(int idProducto, String nombre, String descripcion, double precio, String categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = 0;
        this.fotos = "Por confirmar";
    }

    // Constructor con 4 parámetros
    public Producto(int idProducto, String nombre, String descripcion, double precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = "Por confirmar";
        this.stock = 0;
        this.fotos = "Por confirmar";
    }

    // Constructor con 3 parámetros
    public Producto(int idProducto, String nombre, String descripcion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = 0;
        this.categoria = "Por confirmar";
        this.stock = 0;
        this.fotos = "Por confirmar";
    }

    // Constructor con 2 parámetros
    public Producto(int idProducto, String nombre) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = "Por confirmar";
        this.precio = 0;
        this.categoria = "Por confirmar";
        this.stock = 0;
        this.fotos = "Por confirmar";
    }

    // Constructor con 1 parámetro
    public Producto(int idProducto) {
        this.idProducto = idProducto;
        this.nombre = "Por confirmar";
        this.descripcion = "Por confirmar";
        this.precio = 0;
        this.categoria = "Por confirmar";
        this.stock = 0;
        this.fotos = "Por confirmar";
    }
     public void actualizarStock() {
        System.out.println("Stock actualizado. Nuevo stock: " + stock);
    }

    public int calcularPopularidad() {
        System.out.println("Popularidad calculada: " + stock);
        return stock;
    }
}

