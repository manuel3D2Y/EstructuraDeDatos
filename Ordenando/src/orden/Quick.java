package orden;

import static java.util.Arrays.sort;
import static java.util.Arrays.sort;

public class Quick {

    public static void QuickSD(double[] arreglo) {
        double[] ii = null, dd = null;
        int izq, der;
        double pivote;
        int i, j, k;
        if (arreglo.length <= 1) {
            return;
        }
        pivote = arreglo[arreglo.length - 1];
        izq = der = 0;
        for (i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] <= pivote) {
                izq++;
            } else {
                der++;
            }
        }
        ii = new double[izq];
        dd = new double[der];
        i = 0;
        j = 0;
        for (k = 0; k < arreglo.length - 1; k++) {
            if (arreglo[k] <= pivote) {
                ii[i++] = arreglo[k];
            } else {
                dd[j++] = arreglo[k];
            }
        }
        sort(ii);
        sort(dd);
        k = 0;
        for (i = 0; i < ii.length; i++) {
            arreglo[k++] = ii[i];
        }
        arreglo[k++] = pivote;
        for (j = 0; j < dd.length; j++) {
            arreglo[k++] = dd[j];
        }
    }

    public static void imprimir(double[] valor) {
        String var = "";
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] < 10) {
                var += " " + valor[i] + " ";
            } else {
                var += valor[i] + " ";
            }
        }
        System.out.println(var);
    }

    public static void main(String[] args) {
        double contenido[] = {10.23, 23.10, 55.10, 55.001, 24.15, 24.5, 24.01, 18.0, 13.3, 10.23};

        QuickSD(contenido);
        imprimir(contenido);

    }
}
