import java.util.LinkedList;
import java.util.Scanner;

public class Separar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cadena: ");
        String c = sc.nextLine();

        String[] n = c.split(",");

        for (String nu : n) {
            System.out.println(nu);
        }

    }
}
