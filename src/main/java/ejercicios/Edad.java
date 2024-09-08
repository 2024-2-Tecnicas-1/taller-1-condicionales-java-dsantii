
package ejercicios;

import static ejercicios.Edad.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        
        java.util.Calendar fechaActual = java.util.Calendar.getInstance();
    int annoActual = fechaActual.get(java.util.Calendar.YEAR);
    int mesActual = fechaActual.get(java.util.Calendar.MONTH) + 1; 
    int diaActual = fechaActual.get(java.util.Calendar.DAY_OF_MONTH);

    
    int edad = annoActual - anno;

    
    if (mesActual < mes || (mesActual == mes && diaActual < dia)) {
        edad--;
    }

    
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
