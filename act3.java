import java.util.Scanner;

public class DescuentoCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Tienes tarjeta de cliente? (true/false): ");
        boolean tieneTarjeta = scanner.nextBoolean();

        System.out.print("Introduce el monto de tu compra: ");
        double compra = scanner.nextDouble();

        if (tieneTarjeta && compra > 50) {
            System.out.println("¡Descuento aplicado!");
        } else {
            System.out.println("No aplicas para descuento.");
        }

        scanner.close();
    }
}
