package vendedor;

public class Vendedor {
    public static void main(String[] args) {
        // Usando el constructor completo (dos parámetros)
        Vendedor_eco vendedor1 = new Vendedor_eco("Laptop, Teclado", 4.5f);
        System.out.println("Productos: " + vendedor1.Lista_productos);
        System.out.println("Reputacion: " + vendedor1.Reputacion);

        // Usando el constructor con un solo parámetro (Reputacion por defecto = 0.0)
        Vendedor_eco vendedor2 = new Vendedor_eco("Mouse, Monitor");
        System.out.println("Productos: " + vendedor2.Lista_productos);
        System.out.println("Reputacion: " + vendedor2.Reputacion);
    }
}
