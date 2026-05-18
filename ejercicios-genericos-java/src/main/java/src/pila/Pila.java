/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pila;
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

    public void Apilar(T elemento){
        
        contenido.add(elemento);
    }
    
    public T Desapilar(){
        int tamaño=contenido.size();
        return contenido.remove(tamaño-1);
    }
    
    public T Cima(){
        return contenido.getLast();
    }
    
    public boolean EstaVacia(){
        return contenido.isEmpty();
    }
    
    public int Tamaño(){
        return contenido.size();
        
    }
}
