package persistencia;

import classededados.Aluno;

public class OrdenarPorSituacaoCursoENome extends AlunoPersistenciaSituacaoCursoENome{
    
    public OrdenarPorSituacaoCursoENome(String situacao, String curso, String nome) {
        super(situacao, curso, nome);
        
    }
    
    @Override
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2){
        if(aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) < 0) return true;
        else if(aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) > 0) return false;
        else if(aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao()) == 0){
            if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) > 0) return true;
            else if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) > 0) return false;
            else if(aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso()) == 0){
                if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0) return true;
            }
            return false;
        }
        return false;                    
        }
    }
