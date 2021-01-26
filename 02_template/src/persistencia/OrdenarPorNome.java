package persistencia;

import classededados.Aluno;

public class OrdenarPorNome extends AlunoPersistenciaTemplateMethod{
    
    public OrdenarPorNome(String nome) {
        super(nome);
    }
    @Override
    public  boolean ePrimeiro(Aluno aluno1, Aluno aluno2){
        if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0) return true;
        else return false;
    }
    
}
