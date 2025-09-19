/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Resena {
    // Atributos
    private int idResena;
    private String comentario;
    private int calificacion;

    // Constructor
    public Resena(int idResena, String comentario, int calificacion) {
        this.idResena = idResena;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }

    // Método de la clase
    public void editarResena(String nuevoComentario, int nuevaCalificacion) {
        this.comentario = nuevoComentario;
        this.calificacion = nuevaCalificacion;
        System.out.println("La reseña #" + idResena + " ha sido actualizada.");
    }

    // Getters y Setters
    public int getIdResena() { return idResena; }
    public void setIdResena(int idResena) { this.idResena = idResena; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

    public int getCalificacion() { return calificacion; }
    public void setCalificacion(int calificacion) { this.calificacion = calificacion; }
}
