package persistencia;

import classededados.Aluno;

public class OrdenarPorCursoENome extends AlunoPersistenciaCursoENome{

    public OrdenarPorCursoENome(String curso, String nome) {
        super(curso, nome);
        
    }
    
    @Override
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2){
        if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) < 0) return true;       
        else{
            if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) > 0) return false;
            else if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0) return true;
            else return false;
        }
    }
}
