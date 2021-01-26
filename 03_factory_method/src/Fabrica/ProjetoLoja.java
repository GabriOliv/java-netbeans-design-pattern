
package Fabrica;

import javax.swing.JOptionPane;

public class ProjetoLoja {

    public static void imprimir(Baralho obj){
        String saida = "Codigo: " + obj.getCodigo() + "\n";
        saida += "Desconto: " + obj.getDesconto() + "\n";
        saida += "Embalagem: " + obj.getEmbalagem() + "\n";
        saida += "Marca: " + obj.getMarca() + "\n";
        saida += "Material: " + obj.getMaterial() + "\n";
        saida += "Naipe: " + obj.getNaipe() + "\n";
        saida += "Tamanho:" + obj.getTamanho() + "\n";
        JOptionPane.showMessageDialog(null, saida);
    }

    public static void main(String[] args) {

        boolean controle = true;
        Object[] opcoes = { "Vanguard", "Signature","BicycleICE","Poker_kit"};
        Object tipoBaralho;
        do{
            tipoBaralho = JOptionPane.showInputDialog(null,
                                "Escolha um Produto para mais Informações\nOu clique em Cancelar para Fechar",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"Visnu");
            Baralho obj = LojaDeBaralho.getBaralho(tipoBaralho.toString());
            imprimir(obj);
            return;
            
        }while(controle);
    
    }
    
}
