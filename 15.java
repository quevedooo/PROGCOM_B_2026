/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer lado:");
        double a = Double.parseDouble(entrada.nextLine());

        System.out.println("Ingrese el segundo lado:");
        double b = Double.parseDouble(entrada.nextLine());

        System.out.println("Ingrese el tercer lado:");
        double c = Double.parseDouble(entrada.nextLine());

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Sí pueden formar un triángulo");

            if (a == b && b == c) {
                System.out.println("Es un triángulo equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Es un triángulo isósceles");
            } else {
                System.out.println("Es un triángulo escaleno");
            }

        } else {
            System.out.println("No pueden formar un triángulo");
        }

        entrada.close();
    }
}