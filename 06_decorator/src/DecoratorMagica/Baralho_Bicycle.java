package DecoratorMagica;

public class Baralho_Bicycle extends Baralho {

    public Baralho_Bicycle(){
        descricao = "Baralho para Magica, da Marca Bicycle";
    }

    public double preco(){
        return 50.00;
    }

    public int desconto(){
        return 0;
    }

}
