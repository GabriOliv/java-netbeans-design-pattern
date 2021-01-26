package DecoratorMagica;
import DecoratorMagica.Acessorio;

public class Garrafa extends Acessorio{

    private Baralho pacote;

    public Garrafa(Baralho pacote){
        this.pacote = pacote;
    }

    public String getDescricao(){
        return pacote.getDescricao() + ";\nDentro de Garrafa (Inside of a Glass Bottle)";
    }

    public double preco(){
        return 350 + pacote.preco();
    }

    public int desconto(){
        return 12 + pacote.desconto();
    }

}
