/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecomarket;

/**
 *
 * @author andres
 */
public class Productoeje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Parametros Completos
        Producto a = new Producto("Andres ","Leche100ml ",1200 ,"Lacteos ","Img.jpg ");
        a.MostrarProducto();
        //Cuatro Parametros
         Producto b = new Producto("Andres ","Leche100ml ",1200 ,"Lacteos ");
        b.MostrarProducto();
        //Tres Parametros
         Producto c = new Producto("Andres ","Leche100ml ",1200 );
        c.MostrarProducto();
        //Dos Parametros
         Producto d = new Producto("Andres ","Leche100ml ");
        d.MostrarProducto();
        //Uno Parametros
         Producto e= new Producto("Andres ");
        e.MostrarProducto();
    }
    
}
