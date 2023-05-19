
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Pidiendo el nombre de cada familiar:
        System.out.println("Escriba el nombre del primer familiar: ");
        String familiar1 = sc.nextLine();

        System.out.println("Escriba el nombre del segundo familiar: ");
        String familiar2 = sc.nextLine();

        System.out.println("Escriba el nombre del tercer familiar: ");
        String familiar3 = sc.nextLine();

        //concatenando en una variable el primer caracter en UpperCase y los dos ultimos caracteres del nombre respectivo
        String familiar1New = Character.toUpperCase(familiar1.charAt(1))+"."+familiar1.charAt(familiar1.length()-2)+familiar1.charAt(familiar1.length()-1);
        String familiar2New = Character.toUpperCase(familiar2.charAt(1))+"."+familiar2.charAt(familiar2.length()-2)+familiar2.charAt(familiar2.length()-1);
        String familiar3New = Character.toUpperCase(familiar3.charAt(1))+"."+familiar3.charAt(familiar3.length()-2)+familiar3.charAt(familiar3.length()-1);

        //concatenando en una variable los tres nombres separados por (guion)
        String nombres = familiar1New+"_"+ familiar2New+"_"+familiar3New;

        System.out.println(nombres);


    }
}
