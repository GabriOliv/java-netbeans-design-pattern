package classes;

public class Atendente extends ControladorPedidos {
    //Atributos
    private int numPedido = 0;    
    private CozinhaSingleton filaPedidos = null;
    
    public Atendente(int numPedido, CozinhaSingleton pedidos){
        this.numPedido = numPedido;
        filaPedidos = pedidos;        
    }    
}
