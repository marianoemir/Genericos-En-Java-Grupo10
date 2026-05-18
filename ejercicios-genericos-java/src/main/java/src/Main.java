package src;
import java.util.Arrays;
import java.util.List;


import src.par.Par;
import src.calculadora.Calculadora;
import src.pila.Pila;


public class Main {

    public static void main(String[] args) {
        
         System.out.println("<-----Ejercicio 1--------->");
       //Pruebas de ejercicio 1
       
       //Pruebas con numeros enteros
       Pila<Integer> pila = new Pila<>();
       
       pila.apilar(1);
       pila.apilar(2);
       pila.apilar(3);
       pila.apilar(4);
       
       System.out.println("La cima de la pila es: " + pila.cima());
       //Muestra que elemento de la pila debe eliminarse para desapilarla.
       System.out.println("Elemento eliminado para desapilar: " + pila.desapilar());
       
       if (pila.estaVacia()==false){
           System.out.println("La pila no se encuentra vacia");
       }else{
           System.out.println("La pila se encuentra vacia");
       }
       System.out.println("El tamanio de la pila es: " + pila.tamanio());
       
       //Pruebas con strings
       
       Pila<String> pila2 = new Pila<>();
       pila2.apilar("Andres Fabre");
       pila2.apilar("Facundo Quiroga");
       pila2.apilar("Mariano Chirino");
       
       System.out.println("\nLa cima de la pila es: " + pila2.cima());
       System.out.println("Elemento eliminado para desapilar: " + pila2.desapilar());

       if (pila2.estaVacia()==false){
           System.out.println("La pila no se encuentra vacia");
       }else{
           System.out.println("La pila se encuentra vacia");
       }
       
       System.out.println("El tamanio de la pila es: " + pila2.tamanio());
        
       
        System.out.println("<-----Ejercicio 3--------->");
        
        
        //Ejercicio 3 Pruebas
        // Creamos un Par con un Integer (A) y un String (B) 
        Par<Integer, String> p = new Par<>(123, "Hola");
        System.out.println("Original: " + p);

        // Usamos el método invertir 
        // Ahora el resultado es un Par de String (B) e Integer (A) 
        Par<String, Integer> pInvertido = p.invertir();
        System.out.println("Invertido: " + pInvertido);
        
        
         System.out.println("<-----Ejercicio 4--------->");
        
        
        //Ejercicio 4 Calculadora
        //Probamos calculadora
        //Creamos las listas de numeros
        List<Integer> lista_enteros = Arrays.asList(2, 8, 5, 10);

        List<Double> lista_decimales = Arrays.asList(2.5, 7.8, 1.2);
        //Imprimimos las listas
        System.out.println("Lista de enteros: "+lista_enteros);
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
