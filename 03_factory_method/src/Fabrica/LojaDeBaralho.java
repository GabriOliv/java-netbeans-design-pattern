package Fabrica;

public class LojaDeBaralho {
    public static Baralho getBaralho(String tipoBaralho){
        Baralho obj = null;
        if(tipoBaralho.equalsIgnoreCase("Vanguard")){
            obj = new Vanguard();
        }
        else if(tipoBaralho.equalsIgnoreCase("Signature")){
            obj = new Signature();
        }
        else if(tipoBaralho.equalsIgnoreCase("BicycleICE")){
            obj = new BicycleICE();
        }
        else if(tipoBaralho.equalsIgnoreCase("Poker_kit")){
            obj = new Poker_kit();
        }
        
        return obj;
    }
    
}
