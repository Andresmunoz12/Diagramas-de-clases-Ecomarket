/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecomarket;

/**
 *
 * @author andres
 */
//clase
public class Usuarios {
    private String Nombre;
    private String Email;
    private String Contrasena;
    private String direcion;
    private int Telefono;
    
//Constructor completo
public Usuarios (String Nombre,String Email, String Contrasena, String direcion,int Telefono){
    this.Nombre = Nombre;
    this.Email = Email;
    this.Contrasena = Contrasena;
    this.direcion = direcion ;
    this.Telefono = Telefono;
    }
//Contructor con 4 parametros
public Usuarios(String Nombre,String Email, String Contrasena, String direcion){
    this.Nombre = Nombre;
    this.Email = Email;
    this.Contrasena = Contrasena;
    this.direcion = direcion ;
    this.Telefono = 0;
    }
//Contructor con 3 parametros
public Usuarios(String Nombre,String Email, String Contrasena){
    this.Nombre = Nombre;
    this.Email = Email;
    this.Contrasena = Contrasena;
    this.direcion = "Por confirmar " ;
    this.Telefono = 0;
    }
//Constructor con 2 Parametros
public Usuarios(String Nombre,String Email){
    this.Nombre = Nombre;
    this.Email = Email;
    this.Contrasena = "Por confirmar ";
    this.direcion = "Por confirmar " ;
    this.Telefono = 0;
    }
//constructor con un solo Paramatetro
public Usuarios(String Nombre){
    this.Nombre = Nombre;
    this.Email = "POr confirmar ";
    this.Contrasena = "Por confirmar ";
    this.direcion = "Por confirmar " ;
    this.Telefono = 0;
    }
public void InformacionUsuario(){
    System.out.println("Nombre:"+Nombre+"Email:"+Email+"Contrasena:"+Contrasena+"Direcion:"+direcion+"Telefono:"+Telefono);
 }
}

