package DecoratorMagica;

public class Display extends Acessorio {

    private Baralho pacote;

    public Display(Baralho pacote){
        this.pacote = pacote;
    }

    public String getDescricao(){
        return pacote.getDescricao() + ";\nMostrador de Baralho (Deck Display)";
    }

    public double preco(){
        return 350 + pacote.preco();
    }

    public int desconto(){
        return 11 + pacote.desconto();
    }

}
