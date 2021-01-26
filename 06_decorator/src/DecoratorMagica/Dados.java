package DecoratorMagica;
import DecoratorMagica.Acessorio;

public class Dados extends Acessorio {

    private Baralho pacote;

    public Dados(Baralho pacote){
        this.pacote = pacote;
    }

    public String getDescricao(){
        return pacote.getDescricao() + ";\nKit de Dados (Dice Kit)";
    }

    public double preco(){
        return 30 + pacote.preco();
    }

    public int desconto(){
        return 5 + pacote.desconto();
    }

}
