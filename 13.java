/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su calificación de 0-100:");
        int nota = Integer.parseInt(entrada.nextLine());

        if (nota < 20) {
            System.out.println("Ha obtenido una F");
        } else {
            if (nota >= 20 && nota < 50) {
                System.out.println("Has obtenido una D");
            } else {
                if (nota >= 50 && nota < 70) {
                    System.out.println("Has obtenido una C");
                } else {
                    if (nota >= 70 && nota < 90) {
                        System.out.println("Has obtenido una B");
                    } else {
                        if (nota >= 90 && nota <= 100) {
                            System.out.println("Has obtenido una A");
                        } else {
                            System.out.println("La nota que ha puesto es incorrecta, por favor corrija");
                        }
                    }
                }
            }
        }

        entrada.close();
    }
}