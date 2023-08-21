import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el radio del circulo: ");
        double radio = sc.nextDouble();
        
        double area = Math.PI*Math.pow(radio, 2);

        System.out.println("Area del circulo: " + area);
    }
}
