/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_administrador_reporte;

/**
 *
 * @author ALEJANDRO CANGREJO
 */
public class Administrador {
    // Atributos de la clase Administrador
    private String nombre;
    private int idEmpleado;
    private String rol;
    
    // Constructor completo
public Administrador(String nombre, int idEmpleado, String rol) {
    this.nombre = nombre;
    this.idEmpleado = idEmpleado;
    this.rol = rol;
}
// Constructor de dos parámetros (nombre y idEmpleado)
public Administrador(String nombre, int idEmpleado) {
    this.nombre = nombre;
    this.idEmpleado = idEmpleado;
    this.rol = "Administrador general"; 
}
// Constructor de un parámetro (solo nombre)
public Administrador(String nombre) {
    this.nombre = nombre;
    this.idEmpleado = 0;
    this.rol = "Por asignar";
}
}
