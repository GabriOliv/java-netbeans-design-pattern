package ProjAdapter;

public class Main {


    public static void main(String[] args) {

        Matematica calcular = new Adapter();

        int resta1 = calcular.restaDivisao(100,101);
        int resta2 = calcular.restaDivisao(10,12);

        System.out.println("resta = " + resta1);
        System.out.println("resta2 = " + resta2);
       





    }

}
