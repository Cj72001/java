import java.util.Scanner;

public class DetalleDeFactura {

    static Scanner sc = new Scanner(System.in);

    static Double precio1 = 0d;
    static Double precio2 = 0d;


    public static void precios(){
        
        try {
            
            System.out.println("Escriba el precio 1: ");
            precio1 = sc.nextDouble();

            System.out.println("Escriba el precio 2: ");
            precio2 = sc.nextDouble();

        } catch (Exception e) {
            System.out.println("Hubo un error, ingrese solamente numeros");
            sc.nextLine(); // Limpiando el buffer del teclado
            precios();
        }

    }


    public static void main(String[] args) {
        

        System.out.println("Escriba el nombre de la factura: ");
        String nombreFactura = sc.nextLine();
        
        precios();

        Double totalBruto = precio1 + precio2;

        Double impuesto = 0.19;

        Double totalEImpuesto = totalBruto + (totalBruto * impuesto);

        String facturaStr = "La factura " + nombreFactura + " tiene un total bruto de " + totalBruto +
        ", con un impuesto de " + impuesto + " y el monto despues del impuesto es de "+ totalEImpuesto;

        System.out.println(facturaStr);



    }
}
