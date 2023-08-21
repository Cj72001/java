public class NumeroMayorArreglo {
    public static void main(String[] args) {

        int[] arreglo = {14, 33, 15,  36, 78, 21, 43};

        int numMax = 0;

        for(int n: arreglo){

            if(n > numMax){
                numMax = n;
            }

        }

        System.out.println("Numero mayor: " + numMax);
    }
}
