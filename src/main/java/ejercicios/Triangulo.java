package ejercicios;

import static ejercicios.Triangulo.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Triangulo {
    public static String evaluar(double a, double b, double c) {
        // TODO: Coloca aquí el código del ejercicio 7: Triángulos
        
        if (a + b > c && a + c > b && b + c > a) {
            // Si es un triángulo, determinar su tipo
            if (a == b && b == c) {
                return "El triángulo es equilátero";
            } else if (a == b || a == c || b == c) {
                return "El triángulo es isósceles";
            } else {
                return "El triángulo es escaleno";
            }
        } else {
            
            // Si no cumple la desigualdad triangular, no es un triángulo
            return "No es un triángulo válido";
        }
    
        
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("a:");
        double a = lector.nextDouble();
        System.out.print("b:");
        double b = lector.nextDouble();
        System.out.print("c:");
        double c = lector.nextDouble();
        
        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
    }
}
