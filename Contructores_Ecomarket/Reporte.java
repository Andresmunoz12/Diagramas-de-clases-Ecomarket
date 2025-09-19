/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_administrador_reporte;

/**
 *
 * @author ALEJANDRO CANGREJO
 */
public class Reporte {
    // Atributos de la clase Reporte
    private String titulo;
    private String fecha;
    private String contenido;
    
    // Constructor completo
public Reporte(String titulo, String fecha, String contenido) {
    this.titulo = titulo;
    this.fecha = fecha;
    this.contenido = contenido;
}
// Constructor de dos parámetros (titulo y contenido)
public Reporte(String titulo, String contenido) {
    this.titulo = titulo;
    this.contenido = contenido;
    this.fecha = "Fecha no especificada"; 
}
// Constructor de un parámetro (solo titulo)
public Reporte(String titulo) {
    this.titulo = titulo;
    this.fecha = "Fecha no especificada";
    this.contenido = "Sin contenido";
}
}
