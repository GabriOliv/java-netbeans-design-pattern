package produtos;

import interfaces.Game;

public class SLife implements Game{

    //Atributos

    String nome = "Second Life";

    String developer = "Linden Lab";

    String platform = "Windows";

    String release = "23/06/2003";
    
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

