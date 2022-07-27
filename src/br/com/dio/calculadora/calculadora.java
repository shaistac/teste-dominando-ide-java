package br.com.dio.calculadora;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        /*psvm ou main e dps enter para criar o main*/
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("soma: " + somar);
        System.out.println("subtracao: " + subtrair);
        System.out.println("multiplicacao: " + multiplicar);
        System.out.println("divisao: " + dividir);

    }

    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtrair(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static int dividir(int a, int b) {
        return a / b;
    }

}
