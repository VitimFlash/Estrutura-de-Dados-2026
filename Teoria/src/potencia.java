public class potencia {
    public static int pot(int base, int exp){
        if(exp == 0){
            return 1;
        }
        else {
            return base * pot(base, exp - 1);
        }
    }
    public static void main(String[] args){
        System.out.println("Potência");
        int x,y;
        x = 4;
        y = 3;
        int resultado = pot(x,y);
        System.out.println("A potência de "+ x +" elevado a "+ y + " = "+ resultado);
    }
}
