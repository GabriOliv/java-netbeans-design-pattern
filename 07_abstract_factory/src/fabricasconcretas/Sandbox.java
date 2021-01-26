package fabricasconcretas;

import fabricas.FabricaAbstrata;
import interfaces.Game;

import produtos.Mine;
import produtos.SLife;

public class Sandbox extends FabricaAbstrata {

    public Sandbox(){

        categoria = "Sandbox";

    }

    public Object[] getListaDeGames(){

        Object[] lista = {"Mine","SLife"};

        return lista;

    }

    @Override
    public Game getGame( String modelo ) { 
        if( modelo == null ) {
            return null; 
        }
        else if( modelo.equals("Mine") ) { 
            return new Mine();
        }
        else if( modelo.equals("SLife") ) {
            return new SLife(); 
        }
        else {  return null;} 
    }
}
