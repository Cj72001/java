import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

      int edad = 0;

      // Creando fecha actual
      Date fechaActual = new Date();
      SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");

      // String de fecha actual con formato
      String fechaActualStr = formato.format(fechaActual);

      System.out.println("Ingresa tu fecha de nacimiento yyyy/MM/dd");

      try {
         Date fechaEntrada = formato.parse(sc.next());

         //String de fecha de entrada con formato
         String fechaEntradaStr  = formato.format(fechaEntrada);

         String [] fechaEntradaArr = fechaEntradaStr.split("/");
         String [] fechaActualArr = fechaActualStr.split("/");

         //Si los meses son iguales y el anio actual es mayor que el de entrada:
         int diaActual = Integer.parseInt(fechaActualArr[2]), diaEntrada = Integer.parseInt(fechaEntradaArr[2]);
         int mesActual = Integer.parseInt(fechaActualArr[1]), mesEntrada = Integer.parseInt(fechaEntradaArr[1]);
         int anioActual = Integer.parseInt(fechaActualArr[0]), anioEntrada = Integer.parseInt(fechaEntradaArr[0]);

         edad = Integer.parseInt(fechaActualArr[0]) - Integer.parseInt(fechaEntradaArr[0]);

         //Si el mes actual es mayor o igual al mes de cumple y si el anio actual es mayor al de cumple y 
         //si el dia actual es mayor o igual al de cumple
         if(mesActual >= mesEntrada && anioActual > anioEntrada){

            if(mesActual == mesEntrada && diaActual > diaEntrada){
               edad -=1;
               System.out.println("Edad: " + edad);
            }
            else{
               System.out.println("Edad: "+ edad);
            }

         }
         else{
            edad -= 1;
            System.out.println("Edad: " + edad);
         }



      } catch (Exception e) {
         System.out.println("Error, fecha invalida!!!");
      }


    }
}
