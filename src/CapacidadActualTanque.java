import java.util.Scanner;

public class CapacidadActualTanque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double medidaActual = 0.0;
        
        System.out.println("Escriba la medida actual en litros del estanque: ");
        medidaActual = sc.nextDouble();

        //Para validar que el usuario ingresara una cantidad dentro de la capacidad del tanque
        while(medidaActual>70 || medidaActual<1){
            System.out.println("Ingrese una medida dentro de la capacidad (1-70lt): ");
            medidaActual = sc.nextDouble();
        }
        

        if(medidaActual==70.0){
            System.out.println("Estanque lleno");
        }
        else if(medidaActual>=60 && medidaActual<70){
            System.out.println("Estanque casi lleno");
        }
        else if(medidaActual>=40 && medidaActual<60){
            System.out.println("Estanque 3/4");
        }
        else if(medidaActual>=35 && medidaActual<40){
            System.out.println("Medio Estanque");
        }
        else if(medidaActual>=20 && medidaActual<35){
            System.out.println("Suficiente");
        }
        else if(medidaActual>=1 && medidaActual<20){
            System.out.println("Insuficiente");
        }


    }
}
