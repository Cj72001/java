import java.util.Scanner;

public class ConvertirCadenaColumna {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Pegue la cadena a procesar:");
        String str = sc.nextLine();


        char[] arregloChar = str.toCharArray();
        String str2 = "";

        for(char c: arregloChar){
            if(String.valueOf(c).equals(" ")){
                continue;
            }

            str2 += c;
        }

        String[] arreglo = str2.split(",");

        for(int i = 0; i < arreglo.length; i++){

            switch(arreglo[i].toLowerCase()){
                case "sal": arreglo[i] = " "; break; 
                case "10": arreglo[i] = "10.0"; break;
                case "dos": arreglo[i] = "2.0"; break;
                case "tres": arreglo[i] = "3.0"; break;
                case "cuatro": arreglo[i] = "4.0"; break;
                case "cinco": arreglo[i] = "5.0"; break;
                case "seis": arreglo[i] = "6.0"; break;
                case "siete": arreglo[i] = "7.0"; break;
                case "ocho": arreglo[i] = "8.0"; break;
                case "nueve": arreglo[i] = "9.0"; break;
                case "diez": arreglo[i] = "10.0"; break;
            }
        }

        System.out.println("\n");
        int notas = 0;
        for(String n: arreglo){
            notas++;
            System.out.println(n);
        }

        System.out.println("Cantidad de notas: " + notas);

    }
}
