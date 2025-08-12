public class TiendaCafe {
    public static void main(String[] args) throws Exception {

        Cafe cafe1 = new Cafe("Café de Nariño", "Nariño", 3000.0, 9.0);
        Cafe cafe2 = new Cafe("Café de Antioquia", "Antioquia", 28000.0, 8.0);
        Cafe cafe3 = new Cafe("Café del Huila", "Huila", 30000.0, 5.0);

        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();

        System.out.println("Precio total de " + cafe1.nombre + ": $" + cafe1.calcularPrecioTotal());
        System.out.println("Precio total de " + cafe2.nombre + ": $" + cafe2.calcularPrecioTotal());
        System.out.println("Precio total de " + cafe3.nombre + ": $" + cafe3.calcularPrecioTotal());
        System.out.println("-----------------------------");

        cafe2.actualizarCantidad(12.0);
        System.out.println("Inventario actualizado✏️");
        System.out.println("Cantidad actualizada de " + cafe2.nombre + ":");
        cafe2.mostrarInformacion();

        // Método para aplicar descuento al café

        System.out.println("Aplicando descuento del 10% al primer café...");
        cafe1.aplicarDescuento(10.0);
        cafe1.mostrarInformacion();
    }
}
