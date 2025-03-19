import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00; // Saldo inicial

        System.out.println("\n=== CAJERO AUTOMÁTICO ===");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Realizar ingreso");
        System.out.println("3. Retirar dinero");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Tu saldo actual es: $" + saldo);
                break;
            
            case 2:
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
            
            default:
                System.out.println("Opción no válida.");
        }
        
        scanner.close();
    }
}
