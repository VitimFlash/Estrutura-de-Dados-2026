public class LinkedListSimp<T> {
    private static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T val) {
            this.data = val;
            this.next = null;
        }
    }

    private Node<T> head;
    private int count;

    public LinkedListSimp() {
        this.head = null;
        this.count = 0;
    }

    public boolean isEmpty(){
        return this.count == 0;
    }

    public int getCount(){
        return this.count;
    }

    public void append(T val){
        Node<T> inserted = new Node<>(val);
        Node<T> current;

        if(isEmpty()){
            this.head = inserted;
        } else {
            current = this.head;
            while (current.next != null){
                current = current.next;
            }
            current.next = inserted;
        }
        this.count++;
    }

    public String print(){
        Node<T> current = this.head;
        String output = "";
        while(current != null){
            output += current.data + "  ";
            current = current.next;
        }
        return output;
    }

    public void insertFirst(T val){
        Node<T> inserted = new Node<>(val);
        inserted.next = this.head;
        this.head = inserted;
        this.count++;
    }

    public int indexOf(T val){
        Node<T> current = this.head;
        int position = 0;
        while(current != null){
            if(current.data.equals(val)){
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }

    public boolean remove(T val){
        if(isEmpty()){
            return false;
        }
        if(this.head.data.equals(val)){
            this.head = this.head.next;
            this.count--;
            return true;
        }
        Node<T> current = this.head;
        while(current.next != null){
            if(current.next.data.equals(val)){
                current.next = current.next.next;
                this.count--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main (String[] args){
        LinkedListSimp<String> lista = new LinkedListSimp<>();

        lista.append("3");
        System.out.println(lista.print());

        lista.append("5");
        System.out.println(lista.print());

        lista.insertFirst("1");
        System.out.println(lista.print());

        lista.append("7");
        System.out.println(lista.print());

        System.out.println(lista.indexOf("5"));
        System.out.println(lista.indexOf("1"));
        System.out.println(lista.indexOf("10"));

        lista.remove("7");
        System.out.println(lista.print());
    }
}