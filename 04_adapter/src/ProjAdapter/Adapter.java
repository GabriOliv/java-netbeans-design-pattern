package ProjAdapter;

public class Adapter implements Matematica {
    
    public int restaDivisao(int num, int num1){
        return (int) (Math.min(num,num1));
    }
             
}
