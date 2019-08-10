public class Matematicas {
    private double numero;
    private double exponente;

    public static double elevarNumero(double numero, double exponente){
        double resultado= Math.pow(numero,exponente);
        return resultado;
    }

    public static double raizNumero(double numero){
        double resultado= Math.sqrt(numero);
        return resultado;
    }

    public static boolean numeroPrimo(int numero){
        int contador= 0;
        for(int x=1; x<=numero; x++){
            if (numero%x==0){
                contador++;
            }
        }
        if (contador==2){
            return true;
        }
        return false;
    }
}
