
package fecha;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(3, 28, 2023);
        System.out.println("Fecha actual:");
        fecha.mostrarFecha();

        fecha.setDia(29);
        fecha.setMes(3);
        fecha.setAnio(2024);
        System.out.println("Fecha modificada:");
        fecha.mostrarFecha();
    }
}
