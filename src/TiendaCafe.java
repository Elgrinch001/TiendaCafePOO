public class TiendaCafe {
    public static void main(String[] args) throws Exception {
        Cafe cafe1 = new Cafe("Café de Nariño", "Nariño", 32000f, 10f);
        Cafe cafe2 = new Cafe("Café de Antioquia", "Antioquia", 28000f, 8f);
        Cafe cafe3 = new Cafe("Café del Huila", "Huila", 30000f, 5f);

        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();

        System.out.println("Precio total de " + cafe1.nombre + ": $" + cafe1.calcularPrecioTotal());
        System.out.println("Precio total de " + cafe2.nombre + ": $" + cafe2.calcularPrecioTotal());
        System.out.println("Precio total de " + cafe3.nombre + ": $" + cafe3.calcularPrecioTotal());
        System.out.println("-----------------------------");

        cafe2.actualizarCantidad(12f);
        System.out.println("Cantidad actualizada de " + cafe2.nombre + ":");
        cafe2.mostrarInformacion();
    }
    }

