/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Clase CalculadoraEjemplo que ejemplifica una calculadora sencilla pues 
 * realiza las siguientes operaciones básicas con dos operandos: suma, resta, 
 * multiplicación y división.
 * 
 * @author Fátima Selene Quintero Méndez
 * @version 1.0
 * @since 2024-11
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {
    
    // Atributos de la clase:
    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor para inicializar una instancia de la calculadora
     * con los operandos siguientes:
     * 
     * @param operando1 Primer operando
     * @param operando2 Segundo operando
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Método que realiza la suma de los dos operandos
     * y almacena el resultado 
     * 
     * @return El resultado de la suma
     */
    public double suma() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Método que realiza la resta de los dos operandos
     * y almacena el resultado 
     * 
     * @return El resultado de la resta
     */
    public double resta() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Método que realiza la multiplicación de los dos operandos
     * y almacena el resultado
     * 
     * @return El resultado de la multiplicación
     */
    public double multiplicacion() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Método que realiza la división de los dos operandos
     * y almacena el resultado.Si el divisor es 0, imprime un
     * error y devuelve NaN.
     * 
     * @return El resultado de la división
     */
    public double division() {
        if (operando2 != 0) {
            resultado = operando1 / operando2;
        } else {
            System.out.println("Error: División por cero");
            resultado = Double.NaN; // Devuelve NaN si hay división por cero
        }
        return resultado;
    }
}
