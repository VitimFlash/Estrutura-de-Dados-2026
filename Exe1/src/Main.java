public class Main {
    public static int negativos(int[] vetor){
        int neg = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0){
                neg = neg+1;
            }
        }
        return neg;
    }
    public static int media(int[] vetor){
        int soma = 0, quant = 0;
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2 == 0){
                soma = soma + vetor[i];
                quant = quant + 1;
            }
        }
        return soma/quant ;
    }
    public static int soma(int[] vetor){
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%3 == 0 && vetor[i]%5 == 0){
                soma = soma + vetor[i];
            }
        }
        return soma;
    }
    public static void listar(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 1){
                System.out.print(vetor[i]+ "  ");
            }
        }
    }
    public static void menor(int[] vetor){
        int menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println(menor);
    }
    public static void maior( int[] vetor){
        int maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior){
                maior = vetor[i];
            }
        }
    }
    public static void repetir(int[] vetor){
        int repetir = vetor[0];
        int rep = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (repetir == vetor[i]){
                rep = 1;
            }
        }
        if (rep == 1){
            System.out.println("O vetor apresenta repetição");
        }
        else {
            System.out.println("O vetor não apresenta repetição");
        }
    }
    public static void main(String[] args) {
        int[] vet = new int[20];
        int nega;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 21);
            System.out.print(vet[i]+"  ");
        }
        System.out.println("\nEncontrar números negativos");
        nega = negativos(vet);
        System.out.println(vet);
        System.out.println("\nCalcular a média dos números pares");
        int media = media(vet);
        System.out.println(media(vet));
        System.out.println("\nCalcular soma multiplos de 3 de 5");
        int soma;
        soma = soma(vet);
        System.out.println(soma(vet));
        System.out.println("\nListar números ímpares");
        listar(vet);
        System.out.println("\n\nMostrar menor elemento");
        menor(vet);
        System.out.println("\nPosição maior elemento");
        maior(vet);
        System.out.println("\nNúmeros repetidos");
        repetir(vet);
        System.out.println("\nRemoção de números repetidos");

    }
}