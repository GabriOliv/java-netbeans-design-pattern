package fabricas;

import javax.swing.JOptionPane;
import interfaces.Game;

public class AbstractFactoryProjeto {

    /**
     * @param args the command line arguments
     */
    
    public static void imprimir(Game obj, String categoria){
        String saida = "Categoria: " + categoria + "\n";
        saida += "Nome: " + obj.getNome() + "\n";
        saida += "Developer: " + obj.getDeveloper() + "\n";
        saida += "Platform: " + obj.getPlatform() + "\n";
        saida += "Release: " + obj.getRelease();
        JOptionPane.showMessageDialog(null, saida);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean controle1 = true;
        Object tipoDaFabrica;
        Object[] opcoesDeFabricas = FabricaAbstrata.getListaDeFabricas();
        do{
            tipoDaFabrica = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoesDeFabricas,
                                opcoesDeFabricas[2]);
            
            FabricaAbstrata objFabricaAbstrata = FabricaAbstrata.getInstance(tipoDaFabrica.toString());
            
            String fabrica = objFabricaAbstrata.getCategoria();
            boolean controle2 = true;
            Object objetoDoGame;
            Object[] opcoesDeGames = objFabricaAbstrata.getListaDeGames();
            do{
                objetoDoGame = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoesDeGames,
                                opcoesDeGames[0]);
            if(objetoDoGame==null) controle2=false;
            else{
                Game objetoGame = objFabricaAbstrata.getGame(objetoDoGame.toString());
                imprimir(objetoGame, fabrica);
            }
           }while(controle2); 
            
        }while(controle1);
        
        
    }
}
