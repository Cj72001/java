public class OcurrenciaArreglo {
    public static void main(String[] args) {
        
        int[] suma = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] arreglo = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};
        
        for(int n: arreglo){
            
            switch(n){
                case 1: suma[1]+=1; break;
                case 2: suma[2]+=1; break;
                case 3: suma[3]+=1; break;
                case 4: suma[4]+=1; break;
                case 5: suma[5]+=1; break;
                case 6: suma[6]+=1; break;
                case 7: suma[7]+=1; break;
                case 8: suma[8]+=1; break;
                case 9: suma[9]+=1; break;
                default: System.out.println("Saliste del rango (1-9), el numero " + n + " se ignorara"); break;
            }
        }

        int size = suma.length, max = 0, indice = 1;

        for(int i = 1; i < size; i++){

            if(suma[i] > max){
                indice = i;
                max = suma[i];
            }

        }

        int cant = suma[indice];

        System.out.println("La mayor ocurrencia es: " + cant);
        System.out.println("El elemento que mas se repite es: " + indice);

    }
}
