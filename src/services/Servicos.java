package services;

import java.util.List;

public class Servicos  {


    public <T extends Comparable<T>> T maxSalario(List<T> lista) throws IllegalAccessException {
        T max = lista.get(0);
        for(T ok: lista){
           if(lista.isEmpty()){
               throw  new IllegalAccessException("Lista vazia");
           }if(ok.compareTo( max) > 0){
               ok = max;
            }
        }
        return max;
    }



}
