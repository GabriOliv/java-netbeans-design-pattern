package fabricasconcretas;

import fabricas.FabricaAbstrata;
import interfaces.Game;

import produtos.GT5;
import produtos.NFSMW;

public class Racing extends FabricaAbstrata {

    public Racing(){

        categoria = "Racing";

    }

    public Object[] getListaDeGames(){

        Object[] lista = {"GT5","NFSMW"};

        return lista;

    }

    @Override
    public Game getGame( String modelo ) { 
        if( modelo == null ) {
            return null; 
        }
        else if( modelo.equals("GT5") ) { 
            return new GT5();
        }
        else if( modelo.equals("NFSMW") ) {
            return new NFSMW(); 
        }
        else {  return null;} 
    }
}
