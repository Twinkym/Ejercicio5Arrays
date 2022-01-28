import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[6]; // Se declara variable num y se pone limite de 6.
        Scanner sc = new Scanner(System.in); //

        //Bucle para rellenar el array con los números del usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un numero: ");
            int numero = sc.nextInt();
            numeros[i] = numero;
        }
        System.out.println(numeros);
        
        //Hola :)

        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

