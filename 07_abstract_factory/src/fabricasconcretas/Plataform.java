package fabricasconcretas;

import fabricas.FabricaAbstrata;
import interfaces.Game;

import produtos.DK;
import produtos.SM;

public class Plataform extends FabricaAbstrata{

    public Plataform(){

        categoria = "Plataform";

    }

    public Object[] getListaDeGames(){

        Object[] lista = {"DK","SM"};

        return lista;

    }

    @Override
    public Game getGame( String modelo ) { 
        if( modelo == null ) {
            return null; 
        }
        else if( modelo.equals("DK") ) { 
            return new DK();
        }
        else if( modelo.equals("SM") ) {
            return new SM(); 
        }
        else {  return null;} 
    }
}
