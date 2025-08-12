public class Cafe {

    String nombre;
    String region;
    double precioPorKilo;
    double cantidadEnKilos;

    public Cafe(String nombre, String region, double precioPorKilo, double cantidadEnKilos) {
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

    public double calcularPrecioTotal() {
        return precioPorKilo * cantidadEnKilos;
    }

    public void actualizarCantidad(double nuevaCantidad) {
        cantidadEnKilos = nuevaCantidad;
    }


    public void aplicarDescuento(double porcentaje) {
    if (porcentaje > 0 && porcentaje < 100) {
        double descuento = precioPorKilo * (porcentaje / 100);
        precioPorKilo = precioPorKilo - descuento; 
        System.out.println("Se aplicó un descuento del " + porcentaje + "%. Nuevo precio por kilo: " + precioPorKilo);
    } else {
        System.out.println("Porcentaje inválido. Debe estar entre 0 y 100.");
    }
}

}

