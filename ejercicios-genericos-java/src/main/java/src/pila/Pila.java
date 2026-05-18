package src.pila;
/**
 *
 * @author FACUNDO
 */
import java.util.ArrayList;

public class Pila <T>{
    
    private ArrayList <T> contenido;

    
    public Pila() {
        this.contenido = new ArrayList<>();
    }

    public void apilar(T elemento){
        
        contenido.add(elemento);
    }
    
    public T desapilar(){
        int tamanio=contenido.size();
        return contenido.remove(tamanio-1);
    }
    
    public T cima(){
        return contenido.getLast();
    }
    
    public boolean estaVacia(){
        return contenido.isEmpty();
    }
    
    public int tamanio(){
        return contenido.size();
        
    }
}
