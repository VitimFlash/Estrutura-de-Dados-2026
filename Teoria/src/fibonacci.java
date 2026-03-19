public class fibonacci {
    public static int fib(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        else {
            return fib(n-1) + fib(n -2);
        }
    }
    public static void main(String[] args){
        int x = 7;
        System.out.println("Fibonacci");
        int resultado = fib(x);
        System.out.println("O fibonacci de "+ x +" é: "+resultado);
    }
}
