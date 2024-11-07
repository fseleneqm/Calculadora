/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase Main que crea instancias de la clase CalculadoraEjemplo estableciendo 
 * valores a los operandos 1 y 2 y llama a los métodos de la clase, mostrando
 * los resultados obtenidos de realizar las operaciones básicas
 * 
 * @author Fátima Selene Quintero Méndez
 * @version 1.0
 * @since 2024-11
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class Main {
    /**
     * Método principal que ejecuta el programa
     * 
     * @param args Argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        
        // Crea un objeto de CalculadoraEjemplo con los operandos 10 y 5
        CalculadoraEjemplo calculadora = new CalculadoraEjemplo(8, 3);
        
        // Pruebas de cada método con los valores anteriores y muestra de resultados
        System.out.println("Suma: " + calculadora.suma());
        System.out.println("Resta: " + calculadora.resta());
        System.out.println("Multiplicación: " + calculadora.multiplicacion());
        System.out.println("División: " + calculadora.division());
        
        /* 
        * Crea otro objeto de CalculadoraEjemplo con los operandos 10 y 0 
        * para comprobar el método de la división con un divisor nulo: 
        */
        CalculadoraEjemplo calculadoraDivCero = new CalculadoraEjemplo(10, 0);
        System.out.println("División con divisor cero: " + calculadoraDivCero.division());
    }
}
