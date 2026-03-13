package program2;

import java.util.*;

public class Ejercicio3 {

    // MERGE SORT
    public static void mergeSort(float[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(float[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        float[] L = new float[n1];
        float[] R = new float[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        Random rand = new Random();

        float[] numeros = new float[50];

        // Generar números entre -100 y 100
        for (int i = 0; i < 50; i++) {
            numeros[i] = -100 + rand.nextFloat() * 200;
        }

        ArrayList<Float> positivos = new ArrayList<>();
        ArrayList<Float> negativos = new ArrayList<>();

        // Separar positivos y negativos
        for (float n : numeros) {
            if (n >= 0)
                positivos.add(n);
            else
                negativos.add(n);
        }

        // Convertir a arrays
        float[] pos = new float[positivos.size()];
        float[] neg = new float[negativos.size()];

        for (int i = 0; i < positivos.size(); i++)
            pos[i] = positivos.get(i);

        for (int i = 0; i < negativos.size(); i++)
            neg[i] = negativos.get(i);

        // Ordenar con Merge Sort
        if (pos.length > 0)
            mergeSort(pos, 0, pos.length - 1);

        if (neg.length > 0)
            mergeSort(neg, 0, neg.length - 1);

        // Separar pares e impares (usando casteo)
        ArrayList<Float> pares = new ArrayList<>();
        ArrayList<Float> impares = new ArrayList<>();

        for (float n : pos) {
            int valor = (int) n;

            if (valor % 2 == 0)
                pares.add(n);
            else
                impares.add(n);
        }

        // Mostrar resultados
        System.out.println("ARRAY ORIGINAL:");
        System.out.println(Arrays.toString(numeros));

        System.out.println("\nPOSITIVOS ORDENADOS:");
        System.out.println(Arrays.toString(pos));

        System.out.println("\nNEGATIVOS ORDENADOS:");
        System.out.println(Arrays.toString(neg));

        System.out.println("\nPARES:");
        System.out.println(pares);

        System.out.println("\nIMPARES:");
        System.out.println(impares);
    }
}