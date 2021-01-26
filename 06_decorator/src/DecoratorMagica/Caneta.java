package DecoratorMagica;
import DecoratorMagica.Acessorio;

public class Caneta extends Acessorio{

    private Baralho pacote;

    public Caneta(Baralho pacote){
        this.pacote = pacote;
    }

    public String getDescricao(){
        return pacote.getDescricao() + ";\nCaneta Especial (Special Pen)";
    }

    public double preco(){
        return 15 + pacote.preco();
    }

    public int desconto(){
        return 2 + pacote.desconto();
    }

}
