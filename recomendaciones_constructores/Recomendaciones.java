package recomendaciones;

public class Recomendaciones {
    public static void main(String[] args) {
        // Usando el constructor completo
        Recomendaciones_eco reco1 = new Recomendaciones_eco("Juan", "Compra1, Compra2");
        System.out.println("Nombre: " + reco1.nombre);
        System.out.println("Historial de compras: " + reco1.historial_compras);

        // Usando el constructor con un solo atributo (historial por defecto)
        Recomendaciones_eco reco2 = new Recomendaciones_eco("Ana");
        System.out.println("Nombre: " + reco2.nombre);
        System.out.println("Historial de compras: " + reco2.historial_compras);
    }
}
