package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 0);

        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros(20, 2));
        System.out.println("----------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 5);
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
