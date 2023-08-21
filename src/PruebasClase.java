import java.util.Arrays;

public class PruebasClase {

    // Funcion para agregar un elemento nuevo a un array
    public static int[] agregarElemento(int[] arreglo, int e) {
        int[] nuevoArreglo = new int[arreglo.length + 1];

        for (int i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i];
        }

        nuevoArreglo[arreglo.length] = e;

        return nuevoArreglo;
    }

    //
    public static void paresImpares() {

        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] pares = new int[0];
        int[] impares = new int[0];

        int size = a.length;

        for (int i = 0; i < size; i++) {

            if (a[i] % 2 == 0) {
                pares = agregarElemento(pares, a[i]);
            } else {
                impares = agregarElemento(impares, a[i]);
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(i + ": " + pares[i]);
        }

        System.out.println("\n");
        System.out.println("ImPares");
        for (int i = 0; i < impares.length; i++) {
            System.out.println(i + ": " + impares[i]);
        }

    }

    public static int buscarNumero(int[] numeros, int n) {

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == n) {

                return i;
                // System.out.println("El numero " + n + " esta en la pos: " + i);
                // break;
            }
        }

        return -1;
    }

    //
    public static int[] ingresarNumeroPos(int[] antiguo, int n, int pos) {

        int sizeAntiguo = antiguo.length;
        int[] nuevo = new int[sizeAntiguo + 1];

        boolean encontrado = false;

        for (int i = 0; i < sizeAntiguo + 1; i++) {

            if (i == pos) {
                nuevo[i] = n;
                encontrado = true;
                continue;
            }

            if (encontrado) {
                nuevo[i] = antiguo[i - 1];
            } else {
                nuevo[i] = antiguo[i];
            }
        }

        return nuevo;

    }

    public static int[] desplazarArr(int[] antiguo) {

        int size = antiguo.length;
        int[] nuevo = new int[size];

        for (int i = 1; i < size; i++) {
            nuevo[i] = antiguo[i - 1];
        }

        nuevo[0] = antiguo[size - 1];

        return nuevo;

    }

    public static int[] ingresarOrdenado(int[] antiguo, int e) {
        int size = antiguo.length;
        int[] nuevo = new int[size + 1];

        boolean encontrado = false;

        // Si la insercion tiene que ser al inicio
        if (antiguo[0] > e) {
            System.arraycopy(antiguo, 0, nuevo, 1, nuevo.length-1);
            nuevo[0] = e;

            return nuevo;
        }

        // Si la insercion tiene que ser al final
            if (antiguo[size - 1] < e) {
                System.arraycopy(antiguo, 0, nuevo, 0, nuevo.length-1);
                nuevo[size] = e;
                
                return nuevo;
            }


        for (int i = 0; i < nuevo.length; i++) {

            // Si la insercion tiene que ser al inicio
            // if (i == 0 && antiguo[0] > e) {
            //     nuevo[i] = e;
            //     encontrado = true;
            //     continue;
            // }

            // Si la insercion tiene que ser al final
            // if (i == size - 1 && !encontrado && antiguo[size - 1] < e) {
            //     nuevo[i] = antiguo[size - 1];
            //     nuevo[i + 1] = e;
            //     break;
            // }

            // Si la insercion tiene que ser entre dos numeros
            if (!encontrado && antiguo[i] <= e && antiguo[i + 1] >= e) {
                nuevo[i] = antiguo[i];
                nuevo[i + 1] = e;
                i += 1;
                encontrado = true;
                continue;
            }

            if (encontrado) {
                nuevo[i] = antiguo[i - 1];
                continue;
            } else {
                nuevo[i] = antiguo[i];
            }

        }

        return nuevo;
    }

    public static int[] eliminarElemento(int[] antiguo, int e) {
        int size = antiguo.length;
        int[] nuevo = new int[size - 1];
        boolean encontrado = false;

        for (int i = 0; i < size; i++) {

            if (antiguo[i] == e) {
                encontrado = true;
                continue;
            }

            if (encontrado) {
                nuevo[i - 1] = antiguo[i];
            } else {

                if (i == size - 1) {
                    System.out.println("El elemento no existe");
                    return antiguo;
                }

                nuevo[i] = antiguo[i];
            }

        }

        return nuevo;

    }

    public static void main(String[] args) {

        int[] numeros = { 1, 13, 31, 20 };

        numeros = ingresarOrdenado(numeros, 14);

        for (int n : numeros) {
            System.out.println(n);
        }

    }
}
