package fabricasconcretas;

import fabricas.FabricaAbstrata;
import interfaces.Game;

import produtos.MK11;
import produtos.SF5;

public class Fighting extends FabricaAbstrata {

    public Fighting(){

        categoria = "Fighting";

    }

    public Object[] getListaDeGames(){

        Object[] lista = {"MK11","SF5"};

        return lista;

    }

    @Override
    public Game getGame( String modelo ) { 
        if( modelo == null ) {
            return null; 
        }
        else if( modelo.equals("MK11") ) { 
            return new MK11();
        }
        else if( modelo.equals("SF5") ) {
            return new SF5(); 
        }
        else {  return null;} 
    }
}
