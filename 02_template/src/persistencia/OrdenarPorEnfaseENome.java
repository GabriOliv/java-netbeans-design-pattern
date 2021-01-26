package persistencia;

import classededados.Aluno;

public class OrdenarPorEnfaseENome extends AlunoPersistenciaEnfaseENome{
    
    public OrdenarPorEnfaseENome(String enfase, String nome) {
        super(enfase, nome);
        
    }
    
    @Override
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2){
        
        if(aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) < 0) return true;    
        else{
            if(aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) > 0) return false;
            else if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0) return true;
            else return false;
        }
        
    }
    
}
