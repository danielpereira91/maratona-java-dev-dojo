package academy.devdojo.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // + - / *
        int number1 = 10;
        int number2 = 20;
        int mult = number1*number2;
        float div = (float)number1/(float)number2; // o resultado de 2 números interios sempre será um inteiro, por isso o Casting foi utilizado para transformá-los em Float.

        System.out.println(number2-number1);
        System.out.println(number2+number1);
        System.out.println("Valor "+number2+number1);
        System.out.println(number2+number1+" Valor "+number2+number1);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(number1/number2);
    }
}
