package produtos;

import interfaces.Game;

public class NFSMW implements Game{

    //Atributos

    String nome = "Need for Speed: Most Wanted";

    String developer = "EA Canada";

    String platform = "PlayStation 2";

    String release = "25/11/2005";
    
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

