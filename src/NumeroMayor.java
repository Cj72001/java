import java.util.Scanner;


public class NumeroMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numeroMenor = 0, numeroIngresado = 0;
        
        for(int i =0; i<5; i++){

            System.out.println("Ingrese un numero: ");
            numeroIngresado = sc.nextDouble();

            if(i==0 ||numeroIngresado<numeroIngresado){
                numeroMenor = numeroIngresado;
            }
        }

        if(numeroMenor<10){
            System.out.println("El numero menor es menor que 10!");
        }
        else{
            System.out.println("El numero menor es mayor o igual a 10!");
        }

    }
}
