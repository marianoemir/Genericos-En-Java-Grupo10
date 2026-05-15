package src;

import src.par.Par;

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
    }
}
