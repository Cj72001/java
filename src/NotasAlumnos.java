import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cantidadNotas = 20, notas1 = 0, notas5 = 0, notas4 = 0;
        double nota = 0, promedio5 = 0, promedio4 = 0, promedioTotal = 0;

        for(int i=1; i<cantidadNotas+1; i++){

            System.out.println("Ingrese la nota "+i+": ");
            nota = sc.nextDouble();

            while(nota>7){
                System.out.println("Introduzca una nota correcta (1-7): ");
                nota = sc.nextDouble();
            }

            if(nota==0 || nota==0.0){
                System.out.println("ERROR");
                System.exit(0);
            }

            if(nota>5){
                notas5++;
                promedio5 += nota;
            }
            
            if(nota<4){
                notas4++;
                promedio4 += nota;
            }

            if(nota==1){
                notas1++;
            }

            promedioTotal+= nota;
        }

        promedio5 = promedio5/notas5;
        promedio4 = promedio4/notas4;
        promedioTotal = promedioTotal/cantidadNotas;

        System.out.println("___________________________________________");
        System.out.println("Promedio de notas mayores a 5: " + promedio5);
        System.out.println("Promedio de notas inferiores a 4: " + promedio4);
        System.out.println("Cantidad de notas 1: " + notas1);
        System.out.println("Promedio total: " + promedioTotal);
        System.out.println("___________________________________________");

    }
}
