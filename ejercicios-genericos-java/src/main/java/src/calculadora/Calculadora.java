

package src.calculadora;
import java.util.List;
/**
 *
 * @author andre
 */
public class Calculadora {
    
     // Método genérico para promedio
    public static <T extends Number> double promedio(List<T> lista) {

        if (lista.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (T num : lista) {
            suma += num.doubleValue();
        }

        return suma / lista.size();
    }

    // Método genérico para máximo
    public static <T extends Number> double maximo(List<T> lista) {

        if (lista.isEmpty()) {
            return 0;
        }

        double max = lista.get(0).doubleValue();

        for (T num : lista) {

            if (num.doubleValue() > max) {
                max = num.doubleValue();
            }
        }

        return max;
    }
    
    
}
