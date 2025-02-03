package ht2;

import java.util.Scanner;

public class Grafica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Ingrese el texto en formato Postfix que desea evaluar: ");
        String expression = scanner.nextLine();

        try {
            int resultado = calculadora.evaluate(expression);
            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}