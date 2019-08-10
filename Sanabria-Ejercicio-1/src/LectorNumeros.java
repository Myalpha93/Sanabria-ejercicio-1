import java.util.Scanner;
import java.util.InputMismatchException;

public class LectorNumeros {

    public static int numeroEntero(String mensaje){
        Scanner lector= new Scanner(System.in);
        System.out.printf(mensaje);
        try{
            int numero= lector.nextInt();
            return numero;
        }catch (InputMismatchException e){
            System.out.println("Error. Ingrese un numero entero");
            return numeroEntero(mensaje);
        }
    }

    public static double numeroDouble(String mensaje){
        Scanner lector= new Scanner(System.in);
        System.out.printf(mensaje);
        try{
            double numero= lector.nextDouble();
            return numero;
        }catch (InputMismatchException e){
            System.out.println("Error. Ingrese un numero decimal");
            return numeroEntero(mensaje);
        }
    }
}
