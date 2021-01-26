package produtos;

import interfaces.Game;

public class Mine implements Game{

    //Atributos

    String nome = "Minecraft";

    String developer = "Mojang";

    String platform = "Windows";

    String release = "18/11/2011";
    
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

