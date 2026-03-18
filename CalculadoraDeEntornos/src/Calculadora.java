
import  java.util.Scanner;
public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    static void main(String[] args) {


    }
    public static int suma(int n1, int n2){
        return n1+n2;
    }

    public static int resta(int n1, int n2){
        return n1-n2;
    }

    public static int multiplica(int n1, int n2){
        return n1*n2;
    }

    public static double divide(int n1, int n2){
        if (n2 == 0){
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        try{
            return n1/n2;
        }catch (ArithmeticException e){
            System.out.println("Error aritmetico");
            return 0;
        }

    }

    public static int potencia(int n1, int n2){
        return (int) Math.pow(n1,n2);
    }

    public static double raiz(int n1){
        return Math.sqrt(n1);
    }
}
