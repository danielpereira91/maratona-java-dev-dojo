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

        // % (resto)
        int resto = 20 % 2;
        System.out.println(resto);

        // Operadores lógicos: < , > , <=, >=, ==, !=
        boolean isTenGreaterThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualTwenty = 10 == 20;
        boolean isTenEqualTen = 10 == 10;
        boolean isTenDifferentThanTen = 10 != 10;
        boolean isTenDifferentThanTwenty = 10 != 20;

        System.out.println("Is ten greater than twenty? "+isTenGreaterThanTwenty);
        System.out.println("Is ten less than twenty? "+isTenLessThanTwenty);
        System.out.println("Is ten equal twenty? "+isTenEqualTwenty);
        System.out.println("Is ten equal ten? "+isTenEqualTen);
        System.out.println("Is ten different than ten? "+isTenDifferentThanTen);
        System.out.println("Is ten different than twenty? "+isTenDifferentThanTwenty);
    }
}
