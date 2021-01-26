package classededados;

public class Aluno implements Comparable<Aluno> {
//Atributos
    private String matricula;
    private String nome;
    //Metodos
    public Aluno(String matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    public Aluno(String str){
        String[] vetor = str.split(";");
        this.matricula = vetor[0];
        this.nome = vetor[1];
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void toLong() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    @Override
    public int compareTo(Aluno objeto) {
        return objeto.matricula.compareToIgnoreCase(matricula);
    }
    
}
