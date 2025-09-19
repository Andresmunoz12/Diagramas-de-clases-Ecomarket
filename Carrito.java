/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Administrador
 */
public class Carrito {
    int idCarrito;
    List<Producto> productos;
    double total;

    // Constructor vacío
    public Carrito() {
        this.idCarrito = 0;
        this.productos = new ArrayList<>();
        this.total = 0;
    }

    // Constructor con 3 parámetros
    public Carrito(int idCarrito, List<Producto> productos, double total) {
        this.idCarrito = idCarrito;
        this.productos = productos;
        this.total = total;
    }

    // Constructor con 2 parámetros
    public Carrito(int idCarrito, List<Producto> productos) {
        this.idCarrito = idCarrito;
        this.productos = productos;
        this.total = 0;
    }

    // Constructor con 1 parámetro
    public Carrito(int idCarrito) {
        this.idCarrito = idCarrito;
        this.productos = new ArrayList<>();
        this.total = 0;
    }
     public void agregarProducto(Producto p) {
        productos.add(p);
        calcularTotal();
        System.out.println("Producto agregado: " + p);
    }

    public void eliminarProducto(Producto p) {
        productos.remove(p);
        calcularTotal();
        System.out.println("Producto eliminado: " + p);
    }

    public void calcularTotal() {
        System.out.println("Total del carrito actualizado: $" + total);
    }
}
