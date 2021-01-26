package classededados;

import java.util.Iterator;

public class ColecaoDeObjetos implements Iterator {
    Aluno[] array = null;
    //Aluno[] queue = null;
    int pos = 0;
    public ColecaoDeObjetos(Aluno[] array) throws Exception{
        if(array == null) throw new Exception("Colecao nao enviada");
        this.array = array;
        pos=0;
    }
    @Override
    public boolean hasNext() {
        if(pos==array.length) return false;
        return true;
    }

    @Override
    public Object next() {
        return array[pos++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
