package src;
import java.util.Arrays;
import java.util.List;


import src.par.Par;
import src.calculadora.Calculadora;
import pila.Pila;

public class Main {

    public static void main(String[] args) {
        
       //Pruebas de ejercicio 1
       
       //Pruebas con numeros enteros
       Pila<Integer> pila = new Pila<>();
       
       pila.Apilar(1);
       pila.Apilar(2);
       pila.Apilar(3);
       pila.Apilar(4);
       
       System.out.println("La cima de la pila es: " + pila.Cima());
       //Muestra que elemento de la pila debe eliminarse para desapilarla.
       System.out.println("Elemento eliminado para desapilar: " + pila.Desapilar());
       
       if (pila.EstaVacia()==false){
           System.out.println("La pila no se encuentra vacía");
       }else{
           System.out.println("La pila se encuentra vacía");
       }
       System.out.println("El tamaño de la pila es: " + pila.Tamaño());
       
       //Pruebas con strings
       
       Pila<String> pila2 = new Pila<>();
       pila2.Apilar("Andres Fabre");
       pila2.Apilar("Facundo Quiroga");
       pila2.Apilar("Mariano Chirino");
       
       System.out.println("\nLa cima de la pila es: " + pila2.Cima());
       System.out.println("Elemento eliminado para desapilar: " + pila2.Desapilar());

       if (pila2.EstaVacia()==false){
           System.out.println("La pila no se encuentra vacía");
       }else{
           System.out.println("La pila se encuentra vacía");
       }
       
       System.out.println("El tamaño de la pila es: " + pila2.Tamaño());
        
        
        //Ejercicio 3 Pruebas
        // Creamos un Par con un Integer (A) y un String (B) 
        Par<Integer, String> p = new Par<>(123, "Hola");
        System.out.println("Original: " + p);

        // Usamos el método invertir 
        // Ahora el resultado es un Par de String (B) e Integer (A) 
        Par<String, Integer> pInvertido = p.invertir();
        System.out.println("Invertido: " + pInvertido);
        
        //Probamos calculadora
        //Creamos las listas de numeros
        List<Integer> lista_enteros = Arrays.asList(2, 8, 5, 10);

        List<Double> lista_decimales = Arrays.asList(2.5, 7.8, 1.2);
        //Imprimimos las listas
        System.out.println("Lisa de enteros: "+lista_enteros);
        System.out.println("Lista de decimales: "+lista_decimales);
        //Utilizamos los metodos genericos de la clase calculadora
        //metodos maximo y promedio para la lista de enteros
        System.out.println("Promedio lisa de enteros: "+Calculadora.promedio(lista_enteros));
        System.out.println("Maximo lista de enteros: "+Calculadora.maximo(lista_enteros));
        //metodos maxiumo y promedio para la lista de decimales
        System.out.println("Promedio lista de decimales: "+Calculadora.promedio(lista_decimales));
        System.out.println("Maximo lista de decimales: "+Calculadora.maximo(lista_decimales));
    }
}
