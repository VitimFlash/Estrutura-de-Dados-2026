import java.util.Arrays;

public class ordenacao {
    public static void bubble(int[] vetor) {
        int x = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    x = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = x;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+ "  ");
        }
    }

    public static void selection(int[] vetor){
        int x = 0;
        int menor;
        for (int i = 0; i < vetor.length -1; i++) {
            menor = i;
            for (int j = i +1; j < vetor.length; j++) {
                if (vetor[j] < vetor[menor]){
                    menor = j;
                }
            }
            x = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = x;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+ "  ");
        }
    }

    public static void insection(int[] vetor){
        int x = 0;
        int aux = 0;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            int j;
            for (j = i - 1; j >= 0 && vetor[j] > aux; j--) {
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = aux;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
        }
    }

    public static void quick(int[] vetor, int left, int rigth){
        int i,j,aux;
        i = left;
        j = rigth;
        int pivotidx = (left + rigth )/2;
        int pivot = vetor[pivotidx];

        while (i <= j){
            while (vetor[i]  < pivot){
                i++;
            }
            while (vetor[j] > pivot){
                j--;
            }
            if( i <= j){
                aux = vetor[i];
                vetor[i] =vetor[j];
                vetor[j] = aux;
                i++;
                j--;
            }
        }
        if (left < j){
            quick(vetor, left, j);
        }
        if (i < rigth){
            quick(vetor, i, rigth);
        }
    }
    public static void main(String[] args) {
        int[] vet = new int[10];
        System.out.println("Vetor 1");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 100);
            System.out.print(vet[i] + "  ");
        }

        System.out.println("\nMudança do vetor utilizando BubbleSort");
        bubble(vet);

        System.out.println("\n\nVetor 2");
        int[] vet2 = new int[10];
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = (int) (Math.random() * 100);
            System.out.print(vet2[i] + "  ");
        }
        System.out.println("\nMudança de vetor usando SelectionSort");
        selection(vet2);

        System.out.println("\n\nVetor 3");
        int[] vet3 = new int[10];
        for (int i = 0; i < vet3.length; i++) {
            vet3[i] = (int) (Math.random() * 100);
            System.out.print(vet3[i] + "  ");
        }
        System.out.println("\nMudança de vetor usando InsectionSort");
        insection(vet3);

        System.out.println("\n\nVetor 4");
        int[] vet4 = new int[10];
        for (int i = 0; i < vet4.length; i++) {
            vet4[i] = (int) (Math.random() * 100);
            System.out.print(vet4[i] + "  ");
        }
        System.out.println("\nMudança de vetor QuickSort");
        quick(vet4, 0, vet4.length -1);
        System.out.println(Arrays.toString(vet4));
    }
}