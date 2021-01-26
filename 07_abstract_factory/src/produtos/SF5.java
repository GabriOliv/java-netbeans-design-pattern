package produtos;

import interfaces.Game;

public class SF5 implements Game{

    //Atributos

    String nome = "Street Fighter V";

    String developer = "Capcom";

    String platform = "PlayStation 4";

    String release = "16/02/2016";
    
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

