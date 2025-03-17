import java.util.Scanner;

public class NotasSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota (0-100): ");
        int nota = scanner.nextInt();
        int rango = nota / 10;

        switch (rango) {
            case 10:
            case 9:
                System.out.println("Calificación: A");
                break;
            case 8:
                System.out.println("Calificación: B");
                break;
            case 7:
                System.out.println("Calificación: C");
                break;
            case 6:
                System.out.println("Calificación: D");
                break;
            default:
                System.out.println("Calificación: F");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class NotasIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota (0-100): ");
        int nota = scanner.nextInt();

        if (nota >= 90) {
            System.out.println("Calificación: A");
        } else if (nota >= 80) {
            System.out.println("Calificación: B");
        } else if (nota >= 70) {
            System.out.println("Calificación: C");
        } else if (nota >= 60) {
            System.out.println("Calificación: D");
        } else {
            System.out.println("Calificación: F");
        }

        scanner.close();
    }
}
