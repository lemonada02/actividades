import java.util.Scanner;

public class ClasificadorFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responde las siguientes preguntas para determinar la figura:");

        System.out.print("¿Cuántos lados tiene la figura? (3, 4, 5 o más): ");
        int lados = scanner.nextInt();

        if (lados == 3) {
            System.out.println("Es un triángulo.");
        } else if (lados == 4) {
            System.out.print("¿Todos sus lados son iguales? (true/false): ");
            boolean iguales = scanner.nextBoolean();
            if (iguales) {
                System.out.println("Es un cuadrado.");
            } else {
                System.out.println("Es un rectángulo.");
            }
        } else if (lados == 5) {
            System.out.println("Es un pentágono.");
        } else {
            System.out.println("Es un polígono con más de 5 lados.");
        }

        scanner.close();
    }
}
