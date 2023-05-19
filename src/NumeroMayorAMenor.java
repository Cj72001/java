import java.util.Scanner;

public class NumeroMayorAMenor {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //En caso de que los numeros que se intoduzcan sean decimales 
        //el tipo de las variables sera float para aceptar tanto decimales como enteros
        System.out.println("Escriba el primer numero: ");
        Float n1 = sc.nextFloat();

        System.out.println("Escriba el segundo numero: ");
        Float n2 = sc.nextFloat();

        System.out.println("Los numeros ordenados de mayor a menor son:");

        if(n1>n2){
            System.out.println(n1+"\n"+n2);
        }
        else{
            System.out.println(n2+"\n"+n1);
        }

    }
}
