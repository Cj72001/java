import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean esNumero = false;
        int n1 = 0, n2 = 0;

        pedirNumero: while (!esNumero) {

            System.out.println("Escriba el primer numero: ");

            if (sc.hasNextInt()) {
                n1 = sc.nextInt();
                esNumero = true;
            } else {
                esNumero = false;
                System.out.println("Error: Por favor escribir un NUMERO");
                sc.nextLine();
                continue pedirNumero;
            }

            if (esNumero) {

                System.out.println("Escriba el segundo numero: ");

                if (sc.hasNextInt()) {
                    n2 = sc.nextInt();
                    break;
                } else {
                    esNumero = false;
                    System.out.println("Error: Por favor escribir un NUMERO");
                    sc.nextLine();
                    sc.nextLine();
                    continue pedirNumero;
                }

            }

        }

        int m = 0;
        boolean positivo = true;

        //Calculando el signo del resultado
        //Si son signos contrarios, sera negativo:
        if (n1 < 0 && n2 > 0 || n1 > 0 && n2 < 0) {
            positivo = false;
        }


        //Quitandole signos negativos o a n1 o a n2
        n1 = n1 > -1 ? n1 : -n1; //Math.abs(n1);
        n2 = n2 > -1 ? n2 : -n2; //Math.abs(n2);

        //Una vez teniendo el signo, sumar el primer n1, n2 veces
        for (int i = 0; i < n2; i++) {
            m += n1;
        }

        if (positivo) {
            System.out.println("El producto es = " + m);
        } else {
            System.out.println("El producto es = " + -m);
        }

    }
}
