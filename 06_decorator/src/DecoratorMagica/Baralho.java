package DecoratorMagica;

//Classe Pai
public abstract  class Baralho {
    //Descrição do Produto
    String descricao = "Baralho para Magica (Magic Playable Cards)";
    
    //Descricao do Produto
    public String getDescricao() {
            return descricao;
    }

    //Preco do Produto
    public abstract double preco();

    //Desconto na Compra
    public abstract int desconto();

}
