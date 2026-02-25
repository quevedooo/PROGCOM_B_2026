/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
		

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese su peso corporal:");
        double peso = Double.parseDouble(entrada.nextLine());

        System.out.println("Ingrese su altura:");
        double altura = Double.parseDouble(entrada.nextLine());

        double imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);

        if (imc < 18.5) {
            System.out.println("Estas en bajo peso");
        } else if (imc < 24.5) {
            System.out.println("Estas en el peso ideal");
        } else if (imc < 29.9) {
            System.out.println("Estas en sobrepeso");
        } else {
            System.out.println("Estas en obesidad");
        }
    }
}
	
