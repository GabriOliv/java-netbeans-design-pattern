package persistencia;

import classededados.Aluno;

public class OrdenarPorCursoEnfaseENome extends AlunoPersistenciaCursoEnfaseENome{
    
        public OrdenarPorCursoEnfaseENome(String curso, String enfase, String nome) {
        super(curso, enfase, nome);
        
    }
    
    @Override
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2){
        if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) < 0) return true;
        else if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) > 0) return false;
        else if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) == 0){
            if(aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) > 0) return true;
            else if(aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) > 0) return false;
            else if(aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase()) == 0){
                if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0) return true;
            }
            return false;
        }
        return false;                    
        }
    
}
