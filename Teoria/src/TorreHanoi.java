public class TorreHanoi {
    public static void hanoi(int n, String origem, String destino, String aux){
        if(n == 1){
            System.out.println("\nMova o disco do pino "+ origem + " para o pino "+destino);
        }
        else {
            hanoi(n-1, origem, aux, destino);
            System.out.println("\nMova o disco do pino "+ origem + " para o pino "+destino);
            hanoi(n-1, aux, destino, origem);
        }
    }
    public static void main(String[] args){
        hanoi(8, "A", "B", "aux");
    }
}
