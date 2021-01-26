package produtos;

import interfaces.Game;

public class GT5 implements Game{

    //Atributos

    String nome = "Gran Turismo 5";

    String developer = "Polyphony Digital";

    String platform = "PlayStation 3";

    String release = "24/11/2010";
    
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

