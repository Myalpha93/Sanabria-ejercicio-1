import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean ciclo = true;
        int seleccion;
        double numero;
        while (ciclo) {
            System.out.println("***************");
            System.out.println("*Binevenido*");
            System.out.println("1. Elevar un numero");
            System.out.println("2. Calcular la raiz cuadrada");
            System.out.println("3. Determinar si un numero es primo");
            System.out.println("4. Salir");
            System.out.println("***************");
            seleccion= LectorNumeros.numeroEntero("Seleccione alguna opcion: ");
            switch (seleccion){
                case 1:
                    numero= LectorNumeros.numeroDouble("Ingrese el numero a elevar: ");
                    double exponente= LectorNumeros.numeroDouble("Ingrese el exponente: ");
                    System.out.println("El resultado es: "+ Matematicas.elevarNumero(numero,exponente));
                    break;
                case 2:
                    numero= LectorNumeros.numeroDouble("Ingrese numero a sacar raiz cuadrada: ");
                    System.out.println("El resultado es: "+ Matematicas.raizNumero(numero));
                    break;
                case 3:
                    int numero1= LectorNumeros.numeroEntero("Ingrese el numero (solo debe ingresar numeros enteros): ");
                    if(Matematicas.numeroPrimo(numero1)){
                        System.out.println("Su numero es primo");
                    } else{
                        System.out.println("Su numero no es primo");
                    }
                    break;
                case 4:
                    ciclo=false;
                    break;
                default:
                    System.out.println("Error opcion valida");
                    break;
            }
        }
    }
}
