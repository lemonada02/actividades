import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00; // Saldo inicial
        int opcion;

        do {
            // Menú del cajero automático
            System.out.println("\n=== CAJERO AUTOMÁTICO ===");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Realizar ingreso");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Consultar saldo
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;

                case 2:
                    // Realizar ingreso
                    System.out.print("Introduce la cantidad a ingresar: $");
                    double ingreso = scanner.nextDouble();
                    if (ingreso > 0) {
                        saldo += ingreso;
                        System.out.println("Ingreso exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Cantidad no válida.");
                    }
                    break;

                case 3:
                    // Retirar dinero
                    System.out.print("Introduce la cantidad a retirar: $");
                    double retiro = scanner.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    } else if (retiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        System.out.println("Cantidad no válida.");
                    }
                    break;

                case 4:
                    // Salir
                    System.out.println("Gracias por usar el cajero automático.");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
