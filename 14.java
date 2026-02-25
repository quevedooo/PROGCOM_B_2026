/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de la semana (1 es lunes, 7 es domingo):");
        int num = Integer.parseInt(entrada.nextLine());

        if (num == 1) {
            System.out.println("El día de la semana es lunes");
        } else if (num == 2) {
            System.out.println("El día de la semana es martes");
        } else if (num == 3) {
            System.out.println("El día de la semana es miércoles");
        } else if (num == 4) {
            System.out.println("El día de la semana es jueves");
        } else if (num == 5) {
            System.out.println("El día de la semana es viernes");
        } else if (num == 6) {
            System.out.println("El día de la semana es sábado");
        } else if (num == 7) {
            System.out.println("El día de la semana es domingo");
        } else {
            System.out.println("El número que ingresó no representa un día de la semana, por favor vuelva a intentar");
        }

        entrada.close();
    }
}