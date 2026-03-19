public class BuscaBinária {
    public static int busca(int[] vetor, int num, int inicio, int fim){
        int meio;
        if (inicio > fim){
            return -1;
        }
        else {
            meio = (inicio + fim) / 2;
            if (vetor[meio] == num){
                return meio;
            } else if (num < vetor[meio]) {
                return busca(vetor, num, inicio, meio -1);
            }
            else {
                return busca(vetor, num, meio +1, fim);
            }
        }
    }
    public static void main(String[] args){
        int x = 9;
        int[] vet = new int[9];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = i;
            System.out.print(vet[i] + "  ");
        }
        int inicio = vet[0];
        int fim = vet[8];
        int resultado = busca(vet, x, inicio, fim);
        System.out.println("\n"+resultado);
    }
}
