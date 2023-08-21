import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {

        int size = 10;
        int[] numeros = new int[size];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("\n");

        for (int i = 0; i < size / 2; i++) {
            System.out.print(numeros[i] + ", ");
            System.out.println(numeros[size - 1 - i]);
        }

    }
}
