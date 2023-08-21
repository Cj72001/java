import java.util.Scanner;

public class SistemaEstadistico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = 7;
        int[] numeros = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }

        int positivosS = 0, negativosS = 0, cerosS = 0, positivosC = 0, negativosC = 0, cerosC = 0;

        for (int n : numeros) {

            if (n > 0) {
                positivosS += n;
                positivosC++;
                continue;
            }

            if (n < 0) {
                negativosS += n;
                negativosC++;
                continue;
            }

            cerosS += n;
            cerosC++;

        }

        double positivosP = positivosS / positivosC,
        negativosP = negativosS / negativosC;

        System.out.println("Promedio positivos: " + positivosP);
        System.out.println("Promedio negativos: " + negativosP);
        System.out.println("Cantidad de ceros: " + cerosC);

    }
}
