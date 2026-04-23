import java.util.ArrayDeque;
import java.util.Queue;

public class Fila {
    public static void main(String[] args){
        Queue<Integer> fila = new ArrayDeque();
        fila.add(10);
        fila.add(20);
        fila.add(30);
        System.out.println("Fila: "+ fila);
        System.out.println("Removido: "+ fila.poll());
        System.out.println("Primeiro Elemento: "+ fila.peek());
        System.out.println("Fila Final: "+ fila);
    }
}
