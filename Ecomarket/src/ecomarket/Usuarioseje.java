/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecomarket;

/**
 *
 * @author andres
 */
public class Usuarioseje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Parametros Completo
        Usuarios a = new Usuarios("Andres ","a@gmail.com ","123456 ","calle8 ",10123);
        a.InformacionUsuario();
        // Cuatro Parametros
        Usuarios c = new Usuarios("Andres ","a@gmail.com ","123456 ","calle8 ");
        c.InformacionUsuario();
        //Tres parametros
        Usuarios d = new Usuarios("Andres ","a@gmail.com ","123456 ");
        d.InformacionUsuario();
        //Dos parametros
        Usuarios e = new Usuarios("Andres ","a@gmail.com ");
        e.InformacionUsuario();
        // un Parametro
        Usuarios f = new Usuarios("Andres ");
        f.InformacionUsuario();
    }
    
}
