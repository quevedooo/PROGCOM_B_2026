/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su primer número:");
        int num1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese su segundo número:");
        int num2 = Integer.parseInt(entrada.nextLine());

        System.out.println("¿Qué operación desea realizar? (+, -, *, /):");
        String operacion = entrada.nextLine();

        if (operacion.equals("*")) {
            System.out.println(num1 * num2);
        } 
        else if (operacion.equals("+")) {
            System.out.println(num1 + num2);
        } 
        else if (operacion.equals("/")) {
            if (num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Error: División entre 0");
            }
        } 
        else if (operacion.equals("-")) {
            System.out.println(num1 - num2);
        } 
        else {
            System.out.println("Lo que ingresó no corresponde con las opciones dadas, por favor vuelva a intentar");
        }

        entrada.close();
    }
}
		

    