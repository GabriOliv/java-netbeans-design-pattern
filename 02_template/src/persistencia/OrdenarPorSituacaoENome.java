package persistencia;

import classededados.Aluno;

public class OrdenarPorSituacaoENome extends AlunoPersistenciaSituacaoENome{
    
    public OrdenarPorSituacaoENome(String situacao, String nome) {
        super(situacao, nome);
        
    }
    
    @Override
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2){
        
        if(aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) < 0) return true;       
        else{
            if(aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) > 0) return false;
            else if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0) return true;
            else return false;
        }
        
    }
}
