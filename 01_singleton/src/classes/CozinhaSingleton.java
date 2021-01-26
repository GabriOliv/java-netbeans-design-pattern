package classes;

public class CozinhaSingleton {
    //Atributos.
    private static CozinhaSingleton controladorDeInstancia = null;    
    //Construtor privado à classe.
    private CozinhaSingleton (){
    }
    //Método estático para criar instância da classe SingletonDesignPattern.
    public static CozinhaSingleton getCozinhaSingleton(){
        //Garante que apenas uma instância seja criada.
        if (controladorDeInstancia == null)
            controladorDeInstancia = new CozinhaSingleton();
        return controladorDeInstancia;
    }   
}
