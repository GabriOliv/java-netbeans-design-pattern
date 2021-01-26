package DecoratorMagica;

public class Main {

    public static void main(String[] args) {

        //Primeiro Pacote
        //Baralho Dentro da Garrafa com Caneta
        Baralho pacote001 = new Baralho_Bicycle();
        pacote001 = new Garrafa(pacote001);
        pacote001 = new Caneta(pacote001);

        System.out.println("\nKit Gerado:   "+ pacote001.getDescricao());
        System.out.println("\nPreco Gerado:  " + pacote001.preco());
        System.out.println("\nDesconto Gerado:  " + pacote001.desconto() + "%");

        System.out.println("\n\n");


        //Segundo Pacote
        //Baralho com Caneta com Moeda com Display
        Baralho pacote002 = new Baralho_Theory11();
        pacote002 = new Caneta(pacote002);
        pacote002 = new Moeda(pacote002);
        pacote002 = new Display(pacote002);

        System.out.println("\nKit Gerado:   "+ pacote002.getDescricao());
        System.out.println("\nPreco Gerado:  " + pacote002.preco());
        System.out.println("\nDesconto Gerado:  " + pacote002.desconto() + "%");

        System.out.println("\n\n");


        //Terceiro Pacote
        //Baralho com Display com Dados
        Baralho pacote003 = new Baralho_Theory11();
        pacote003 = new Display(pacote003);
        pacote003 = new Dados(pacote003);

        System.out.println("\nKit Gerado:   "+ pacote003.getDescricao());
        System.out.println("\nPreco Gerado:  " + pacote003.preco());
        System.out.println("\nDesconto Gerado:  " + pacote003.desconto() + "%");

        System.out.println("\n\n");

    }

}

