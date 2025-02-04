package ht2;

import java.util.Stack;
import java.util.StringTokenizer;

public class Calculadora implements ICalculadora {
    
    IStack<Integer> miPila = new StackWithVector<>();

    @Override
    public int evaluate(String expression) throws Exception {
        StringTokenizer tokens = new StringTokenizer(expression, "");

        while (tokens.hasMoreTokens()){
            String token = tokens.nextToken();
        }

        if (esNumero(tokens)){
            miPila.push(Integer.parseInt(token));
        }
        else{
            int n2 = miPila.pop();
            int n1 = miPila.pop();
            int resultado = operar(n1, n2, token);
            miPila.push(resultado);
        }
        return miPila.pop();
    }

    private boolean esNumero(String s){
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    private int operar(int n1, int n2, String operador) throws Exception {
        switch (operador) {
            case "+":
                return n1 +n2;
            case "-":
                return n1 - n2;
            case "*":
                return (n1 * n2);
            case "/":
                if (n2 == 0) throw new ArithmeticException("Division por cero no permitida");
                return (n1 / n2);
            case "%":
                if (n2 == 0) throw new ArithmeticException("Modulo por cero no permitido");
                return n1 % n2;
            default: throw new Exception("Operador invalido: " + operador);
        }
    }


}
