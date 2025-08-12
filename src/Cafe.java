public class Cafe {

    String nombre;
    String region;
    float precioPorKilo;
    float cantidadEnKilos;

    public Cafe(String nombre, String region, float precioPorKilo, float cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del café: " + nombre);
        System.out.println("Región: " + region);
        System.out.println("Precio por kilo: $" + precioPorKilo);
        System.out.println("Cantidad disponible: " + cantidadEnKilos + " kg");
        System.out.println("-----------------------------");
    }

    public float calcularPrecioTotal() {
        return precioPorKilo * cantidadEnKilos;
    }

    public void actualizarCantidad(float nuevaCantidad) {
        cantidadEnKilos = nuevaCantidad;
    }

}
