package orden;

public class Onrdenando {

    public static void quick(int vect[], int izq, int der) {
        //declaraciun de de variables
        int i = 0, j = 0;
        int x = 0, aux = 0;
        i = izq;
        j = der;
        x = vect[(izq + der) / 2];
        do {
            while ((vect[i] < x) && (j <= der)) {
                i++;
            }
            while ((x < vect[j]) && (j > izq)) {
                j--;
            }
            if (i <= j) {
                aux = vect[i];
                vect[i] = vect[j];
                vect[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        if (izq < j) {
            quick(vect, izq, j);
        }
        if (i < der) {
            quick(vect, i, der);
        }
    }

    public static void main(String[] args) {
        int arreglo[] = {25, 14, 5, 1, 0, 33, 15, 16, 21, 6, 0};
        quick(arreglo, 0, arreglo.length - 1);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

}
