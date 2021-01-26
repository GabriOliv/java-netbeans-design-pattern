package produtos;

import interfaces.Game;

public class MK11 implements Game{

    //Atributos

    String nome = "Mortal Kombat 11";

    String developer = "NetherRealm Studios";

    String platform = "Xbox One";

    String release = "23/04/2019";
    
    //Metodos

    @Override
    public String getNome(){return nome;}

    @Override
    public String getDeveloper(){return developer;}

    @Override
    public String getPlatform(){return platform;}

    @Override
    public String getRelease(){return release;}
}

