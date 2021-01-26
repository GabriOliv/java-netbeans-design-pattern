package produtos;

import interfaces.Game;

public class SM implements Game{

    //Atributos

    String nome = "Super Mario World";

    String developer = "Nintendo EAD";

    String platform = "Game Boy Advance";

    String release = "21/11/1990";
    
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

