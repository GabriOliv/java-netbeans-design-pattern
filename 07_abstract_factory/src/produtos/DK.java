package produtos;

import interfaces.Game;

public class DK implements Game{

    //Atributos

    String nome = "Donkey Kong";

    String developer = "Nintendo R&D1";

    String platform = "Arcade";

    String release = "09/07/1981";
    
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

