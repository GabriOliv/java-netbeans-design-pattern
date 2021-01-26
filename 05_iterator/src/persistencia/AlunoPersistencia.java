package persistencia;
import classededados.Aluno;
import classededados.ColecaoDeObjetos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

public class AlunoPersistencia {
    //Atributos
    private String nomeDoArquivo;
    //Metodos
    public AlunoPersistencia(String nome){
        nomeDoArquivo = nome;
    }
    private int quantidadeDeAlunosNoArquivo()throws Exception{
        try{
            int quantidade = 0;
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            while((linha=br.readLine())!=null){
                quantidade++;
            }
            br.close();
            return quantidade; 
        }catch(Exception erro){
            throw erro;
        } 
    }
    public Iterator listagemDeAlunosVetor()throws Exception{
        try{
            int quantidade = this.quantidadeDeAlunosNoArquivo();
            Aluno[] array = new Aluno[quantidade];
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                Aluno aux = new Aluno(linha);
                array[pos] = aux;
                pos++;
            }
            br.close();
            ColecaoDeObjetos aux = new ColecaoDeObjetos(array);
            return aux;
        }catch(Exception erro){
            throw erro;
        } 
    }
    public Iterator listagemDeAlunosArrayList()throws Exception{
        try{
            ArrayList<Aluno> array = new ArrayList<Aluno>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                Aluno aux = new Aluno(linha);
                array.add(aux);
                pos++;
            }
            br.close();
            return array.iterator();
        }catch(Exception erro){
            throw erro;
        } 
    }
    public Iterator listagemDeAlunosFila()throws Exception{
        try{            
            Queue<Aluno> queue = new LinkedList<Aluno>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                Aluno aux = new Aluno(linha);
                queue.add(aux);
                pos++;
            }
            br.close();
            return queue.iterator();
        }catch(Exception erro){
            throw erro;
        }
    }
    
    public Iterator listagemDeAlunosPilha()throws Exception{
        try{   
            Stack<Aluno> pilha = new Stack<Aluno>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                Aluno aux = new Aluno(linha);
                pilha.add(aux);
                pos++;
            }
            br.close();
            return pilha.iterator();
        }catch(Exception erro){
            throw erro;
        }
    }
    
    public Iterator listagemDeAlunosArvore()throws Exception{
        try{   
            Set<Aluno> arvore = new TreeSet<Aluno>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                Aluno aux = new Aluno(linha);
                arvore.add(aux);
                pos++;
            }
            br.close();
            return arvore.iterator();
        }catch(Exception erro){
            throw erro;
        }
    }
    
    public Iterator listagemDeAlunosLista()throws Exception{
        try{   
            List<Aluno> lista = new LinkedList<Aluno>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                Aluno aux = new Aluno(linha);
                lista.add(aux);
                pos++;
            }
            br.close();
            return lista.iterator();
        }catch(Exception erro){
            throw erro;
        }
    }
    
    public Iterator listagemDeAlunosSetList()throws Exception{
        try{   
            LinkedList<Aluno> setList = new LinkedList<Aluno>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                Aluno aux = new Aluno(linha);
                setList.add(aux);
                pos++;
            }
            br.close();
            return setList.iterator();
        }catch(Exception erro){
            throw erro;
        }
    }
}