package src.par;

/**
 *
 * @author Mariano_Chirino
 */
public class Par<A, B> {

    /*
    Ejercicio 3 — Par<A,B>
    Crear una clase genérica que almacene dos valores.
    Agregar un método:
    invertir()
    que devuelva el par invertido.
     */

    private A primero;
    private B segundo;

    public Par(A primero, B segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public Par<B, A> invertir() {
        return new Par<>(this.segundo, this.primero);
    }

    public A getPrimero() {
        return primero;
    }

    public B getSegundo() {
        return segundo;
    }

    @Override
    public String toString() {
        return "(" + primero + ", " + segundo + ")";
    }
}

