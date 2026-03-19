import java.util.Arrays;

public class trabalho {
    public static void bubble(int[] vetor) {
        int x = 0;

        for(int i = 0; i < vetor.length - 1; ++i) {
            for(int j = 0; j < vetor.length - 1 - i; ++j) {
                if (vetor[j] > vetor[j + 1]) {
                    x = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = x;
                }
            }
        }

        for(int i = 0; i < vetor.length; ++i) {
            System.out.print(vetor[i] + "  ");
        }

    }

    public static void selection(int[] vetor) {
        int x = 0;

        for(int i = 0; i < vetor.length - 1; ++i) {
            int menor = i;

            for(int j = i + 1; j < vetor.length; ++j) {
                if (vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }

            x = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = x;
        }

        for(int i = 0; i < vetor.length; ++i) {
            System.out.print(vetor[i] + "  ");
        }

    }

    public static void insection(int[] vetor) {
        int x = 0;
        int aux = 0;

        for(int i = 1; i < vetor.length; ++i) {
            aux = vetor[i];

            int j;
            for(j = i - 1; j >= 0 && vetor[j] > aux; --j) {
                vetor[j + 1] = vetor[j];
            }

            vetor[j + 1] = aux;
        }

        for(int i = 0; i < vetor.length; ++i) {
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
        int[] vetB = new int[100];
        System.out.println("\nBubbleSort\nVetor em Ordem");
        for(int i = 0; i < vetB.length; ++i) {
            vetB[i] = i;
            System.out.print(vetB[i] + "  ");
        }
        System.out.println("\nMudança do vetor ordenado por BubbleSort");
        long inicio = System.nanoTime();
        bubble(vetB);
        long fim = System.nanoTime();
        long duracaoNano = fim - inicio;
        double duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + " ms");
        int[] vetB1 = new int[100];

        System.out.println("\n\nVetor invertido");
        int j = 0;
        for(int i = 99; i >= 0; --i) {
            vetB1[i] = j++;
        }

        for(int i = 0; i < vetB1.length; ++i) {
            System.out.print(vetB1[i] + "  ");
        }
        System.out.println("\nMudança do vetor invertido por BubbleSort");
        inicio = System.nanoTime();
        bubble(vetB1);
        fim = System.nanoTime();
        duracaoNano = fim - inicio;
        duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + " ms");

        int[] vetB2 = new int[100];
        System.out.println("\n\nVetor Aleatório");
        for(int i = 0; i < vetB2.length; ++i) {
            vetB2[i] = (int)(Math.random() * (double)100.0F);
            System.out.print(vetB2[i] + "  ");
        }

        System.out.println("\nMudança do vetor aleatório por BubbleSort");
        inicio = System.nanoTime();
        bubble(vetB2);
        fim = System.nanoTime();
        duracaoNano = fim - inicio;
        duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + " ms");

        int[] vetS = new int[100];
        System.out.println("\nSelectionSort\nVetor ordenado");
        for(int i = 0; i < vetS.length; ++i) {
            vetS[i] = i;
            System.out.print(vetS[i] + "  ");
        }

        System.out.println("\nMudança do vetor ordenado por SelectionSort");
        inicio = System.nanoTime();
        selection(vetS);
        fim = System.nanoTime();
        duracaoNano = fim - inicio;
        duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + "ms");

        int[] vetS1 = new int[100];
        System.out.println("\n\nVetor Invertido");
        j = 0;
        for(int i = 99; i >= 0; --i) {
            vetS1[i] = j++;
        }

        for(int i = 0; i < vetS1.length; ++i) {
            System.out.print(vetS1[i] + "  ");
        }

        System.out.println("\nMudança do vetor invertido por SelectionSort");
        inicio = System.nanoTime();
        selection(vetS1);
        fim = System.nanoTime();
        duracaoNano = fim - inicio;
        duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + "ms");

        System.out.println("\n\nVetor Aleatório");
        int[] vetS2 = new int[100];
        for(int i = 0; i < vetS2.length; ++i) {
            vetS2[i] = (int)(Math.random() * (double)100.0F);
            System.out.print(vetS2[i] + "  ");
        }

        System.out.println("\nMudança do vetor aleatório por SelectionSort");
        inicio = System.nanoTime();
        bubble(vetS2);
        fim = System.nanoTime();
        duracaoNano = fim - inicio;
        duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + " ms");
        int[] vetID = new int[100];

        System.out.println("\nInsectionSort\nVetor ordenado");
        for(int i = 0; i < vetID.length; ++i) {
            vetID[i] = i;
            System.out.print(vetID[i] + "  ");
        }
        System.out.println("\nMudança do vetor ordenado por InsectionSort");
        inicio = System.nanoTime();
        insection(vetID);
        fim = System.nanoTime();
        duracaoNano = fim - inicio;
        duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + " ms");

        int[] vetID1 = new int[100];
        System.out.println("\n\nVetor Invertido");
        j = 0;
        for(int i = 99; i >= 0; --i) {
            vetID1[i] = j++;
        }

        for(int i = 0; i < vetID1.length; ++i) {
            System.out.print(vetID1[i] + "  ");
        }

        System.out.println("\nMudança do vetor invertido por InsectionSort");
        inicio = System.nanoTime();
        selection(vetID1);
        fim = System.nanoTime();
        duracaoNano = fim - inicio;
        duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + "ms");

        int[] vetID2 = new int[100];
        System.out.println("\n\nVetor Aleatório");
        for(int i = 0; i < vetID2.length; ++i) {
            vetID2[i] = (int)(Math.random() * (double)100.0F);
            System.out.print(vetID2[i] + "  ");
        }

        System.out.println("\nMudança do vetor aleatório por InsectionSort");
        inicio = System.nanoTime();
        bubble(vetID2);
        fim = System.nanoTime();
        duracaoNano = fim - inicio;
        duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + " ms");

        int[] vetQ = new int[100];
        System.out.println("\nQuickSort\nVetor ordenado");
        for(int i = 0; i < vetQ.length; ++i) {
            vetQ[i] = i;
            System.out.print(vetQ[i] + "  ");
        }
        System.out.println("\nMudança do vetor ordenado por QuickSort");
        inicio = System.nanoTime();
        quick(vetQ, 0, vetQ.length -1);
        fim = System.nanoTime();
        duracaoNano = fim - inicio;
        System.out.println(Arrays.toString(vetQ));
        duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + " ms");

        int[] vetQ1 = new int[100];
        System.out.println("\n\nVetor Invertido");
        j = 0;
        for(int i = 99; i >= 0; --i) {
            vetQ1[i] = j++;
        }

        for(int i = 0; i < vetQ1.length; ++i) {
            System.out.print(vetQ1[i] + "  ");
        }

        System.out.println("\nMudança do vetor invertido por QuickSort");
        inicio = System.nanoTime();
        selection(vetQ1);
        fim = System.nanoTime();
        duracaoNano = fim - inicio;
        duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + "ms");

        int[] vetQ2 = new int[100];
        System.out.println("\n\nVetor Aleatório");
        for(int i = 0; i < vetQ2.length; ++i) {
            vetQ2[i] = (int)(Math.random() * (double)100.0F);
            System.out.print(vetQ2[i] + "  ");
        }

        System.out.println("\nMudança do vetor aleatório por QuickSort");
        inicio = System.nanoTime();
        bubble(vetQ2);
        fim = System.nanoTime();
        duracaoNano = fim - inicio;
        duracaoMili = (double)duracaoNano / (double)1.0E7F;
        System.out.println("\nTempo de execução: " + duracaoMili + " ms");
    }
}