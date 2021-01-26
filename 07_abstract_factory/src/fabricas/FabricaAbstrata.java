package fabricas;

import fabricasconcretas.Fighting;
import fabricasconcretas.Plataform;
import fabricasconcretas.Racing;
import fabricasconcretas.Sandbox;

import interfaces.Game;

public abstract class FabricaAbstrata {
    //Atributos
    protected String categoria;
    
    public static Object[] getListaDeFabricas(){
        Object[] lista = {"Fighting","Plataform","Racing","Sandbox"};
        return lista;
    }

    public String getCategoria(){return categoria;}

    public abstract Object[] getListaDeGames();

    public abstract Game getGame(String Game);

    public static FabricaAbstrata getInstance( String categoria ) { 
        if( categoria == null ) {
            return null; 
        }
        else if(categoria.equals("Fighting")) { 
            return new Fighting();
        }
        else if(categoria.equals("Plataform")) {
            return new Plataform();
        }
        else if(categoria.equals("Racing")) {
            return new Racing();
        }
        else if(categoria.equals("Sandbox")) {
            return new Sandbox();
        }
        else {return null;}
    }
}
