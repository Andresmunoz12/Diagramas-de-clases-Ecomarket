/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecomarket_angel;

import java.util.Date;

public class Pago {
    // Atributos
    private int idPago;
    private String metodoPago;
    private double monto;
    private Date fecha;
    private String estado;

    // Constructor
    public Pago(int idPago, String metodoPago, double monto, Date fecha, String estado) {
        this.idPago = idPago;
        this.metodoPago = metodoPago;
        this.monto = monto;
        this.fecha = fecha;
        this.estado = estado;
    }

    // Métodos
    public void procesarPago() {
        if (monto > 0) {
            this.estado = "Procesado";
            System.out.println("El pago de $" + monto + " con método " + metodoPago + " ha sido procesado.");
        } else {
            System.out.println("Error: el monto debe ser mayor a 0.");
        }
    }

    public void verificarPago() {
        if ("Procesado".equals(this.estado)) {
            System.out.println("El pago #" + idPago + " está confirmado.");
        } else {
            System.out.println("El pago #" + idPago + " aún no ha sido procesado.");
        }
    }

    // Getters y Setters
    public int getIdPago() { return idPago; }
    public void setIdPago(int idPago) { this.idPago = idPago; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
