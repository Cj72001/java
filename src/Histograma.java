public class Histograma {
    public static void main(String[] args) {

        String[] ocurrencias = {"", "", "", "", "", "", ""};
        int[] arreglo = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        
        for(int n: arreglo){
            
            switch(n){
                case 1: ocurrencias[1]+="*"; break;
                case 2: ocurrencias[2]+="*"; break;
                case 3: ocurrencias[3]+="*"; break;
                case 4: ocurrencias[4]+="*"; break;
                case 5: ocurrencias[5]+="*"; break;
                case 6: ocurrencias[6]+="*"; break;
                default: System.out.println("Saliste del rango (1-6), el numero " + n + " se ignorara"); break;
            }
        }

        int size = ocurrencias.length;

        for(int i = 1; i < size; i++){
            System.out.println(i + ": " + ocurrencias[i]);
        }
    }
}
