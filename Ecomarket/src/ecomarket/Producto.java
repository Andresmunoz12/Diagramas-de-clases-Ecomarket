/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecomarket;

/**
 *
 * @author andres
 */
//Clase
public class Producto {
    private String Nombre;
    private String Descripcion;
    private int Precio ;
    private String Categoria;
    private String Imagen;
    //Contructor Con todos los  parametros
public Producto(String Nombre,String Descripcion,int Precio,String Categoria,String Imagen){
    this.Nombre = Nombre;
    this.Descripcion = Descripcion;
    this.Precio = Precio;
    this.Categoria = Categoria;
    this.Imagen = Imagen;
}
    //Constructor con cuatro parametros
public Producto(String Nombre,String Descripcion,int Precio,String Categoria){
    this.Nombre = Nombre;
    this.Descripcion = Descripcion;
    this.Precio = Precio;
    this.Categoria = Categoria;
    this.Imagen = "Por Definir";
}
//Constructor con  tres parametors
public Producto(String Nombre,String Descripcion,int Precio){
    this.Nombre = Nombre;
    this.Descripcion = Descripcion;
    this.Precio = Precio;
    this.Categoria = "Por Definir";
    this.Imagen = "Por Definir";
}
//Constructor con dos  parametros
public Producto(String Nombre,String Descripcion){
    this.Nombre = Nombre;
    this.Descripcion = Descripcion;
    this.Precio = 0;
    this.Categoria = "Por Definir";
    this.Imagen = "Por Definir";
}
//Constructor con un parametro
public Producto(String Nombre){
    this.Nombre = Nombre;
    this.Descripcion = "Por Definir";
    this.Precio = 0;
    this.Categoria = "Por Definir";
    this.Imagen = "Por Definir";
}
public void MostrarProducto(){
    System.out.println("Nombre: "+Nombre+"Descircion: "+Descripcion+"Precio: "+Precio+" Categoria: "+Categoria+"Imagen: "+Imagen);
}
}
