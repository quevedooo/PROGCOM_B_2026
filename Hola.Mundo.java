package holamundo;
import java.util.*;

/**
 *
 * @author Luis Quevedo
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lluvia;
//Saludar al mundo
        System.out.println("Hola Mundo. Bienvenido a PROGCOM-B");
        System.out.println("Esta lloviendo?");
        //Estamos definindo un objeto de tipo Scanner
        Scanner play = new Scanner(System.in);
        lluvia=play.nextLine();
        
        System.out.println("Tu respuesta fue: "+lluvia);
        
        if (lluvia.equals("si")){
            System.out.println("Use sombrilla.Guarde la ropa");
        }else{
            System.out.println("Salga tranquilo");
        }
        //IF ternario
    String aguacero = (lluvia.equals("si")) ? "Use sombrilla.Guarde la ropa" : "Salga tranquilo";
    System.out.println(aguacero);
    }
    
    
}