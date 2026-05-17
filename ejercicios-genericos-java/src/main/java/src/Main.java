package src;
import java.util.Arrays;
import java.util.List;


import src.par.Par;
import src.calculadora.Calculadora;

public class Main {

    public static void main(String[] args) {
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
