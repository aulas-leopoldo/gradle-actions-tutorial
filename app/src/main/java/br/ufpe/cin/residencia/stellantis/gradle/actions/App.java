/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package br.ufpe.cin.residencia.stellantis.gradle.actions;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Olá, Mundo!";
    }

    public static int soma(int a, int b) { 
        return a + b;
    }

    public static int multiplicacao(int a, int b) { 
        return a * b;
    }

    public static int subtracao(int a, int b) { 
        return a - b;
    }

    public static int divisao(int a, int b) { 
        if (b!=0) { 
            return a/b;
        }
        else { 
            throw new RuntimeException("Divisao por zero!");
        }
    }
    
    public static String resultadoSoma(int a, int b) { 
        return resultado(a, b, soma(a,b), " + ");
    }

    public static String resultadoSubtracao(int a, int b) { 
        return resultado(a, b, subtracao(a,b), " - ");
    }

    public static String resultadoMultiplicacao(int a, int b) { 
        return resultado(a, b, multiplicacao(a,b), " * ");
    }

    public static String resultado(int a, int b, int resultado, String operacao) { 
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(operacao);
        sb.append(b);
        sb.append(" = "); 
        sb.append(resultado);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.print("Digite o primeiro número: ");
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        System.out.print("Digite o segundo número: ");
        scanner = new Scanner(System.in);
        String num2 = scanner.nextLine();
        int n1 = Integer.valueOf(num1);
        int n2 = Integer.valueOf(num2);
        
        System.out.println(resultadoSoma(n1,n2));
        System.out.println(resultadoSubtracao(n1,n2));
        System.out.println(resultadoMultiplicacao(n1,n2));
    }
}
