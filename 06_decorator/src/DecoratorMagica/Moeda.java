package DecoratorMagica;
import DecoratorMagica.Acessorio;

public class Moeda extends Acessorio {

    private Baralho pacote;

    public Moeda(Baralho pacote){
        this.pacote = pacote;
    }

    public String getDescricao(){
        return pacote.getDescricao() + ";\nMoeda Estilizada (Styled Coin)";
    }

    public double preco(){
        return 35 + pacote.preco();
    }

    public int desconto(){
        return 3 + pacote.desconto();
    }

}
