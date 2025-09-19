/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;

public class Pedido {
    // Atributos
    private int idPedido;
    private Date fecha;
    private String estado;
    private double total;

    // Constructor
    public Pedido(int idPedido, Date fecha, String estado, double total) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.estado = estado;
        this.total = total;
    }

    // Métodos de la clase
    public void confirmarPedido() {
        this.estado = "Confirmado";
        System.out.println("El pedido #" + idPedido + " ha sido confirmado.");
    }

    public void cancelarPedido() {
        this.estado = "Cancelado";
        System.out.println("El pedido #" + idPedido + " ha sido cancelado.");
    }

    // Getters y Setters
    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
            
