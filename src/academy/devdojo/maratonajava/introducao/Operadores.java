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

        // Operadores Relacionais: < , > , <=, >=, ==, !=
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

        // && (AND), || (OR), ! (NOT)
        int age = 35;
        float salary = 3500f;
        boolean isInLawAndGreaterThan30 = age >= 30 && salary >= 4612;
        boolean isInLawAndLessThan30 = age < 30 && salary >= 3381;
        System.out.println("Is in law and geater than 30? "+isInLawAndGreaterThan30);
        System.out.println("Is in law and less than 30? "+isInLawAndLessThan30);
        age = 29;
        isInLawAndGreaterThan30 = age >= 30 && salary >= 4612;
        isInLawAndLessThan30 = age < 30 && salary >= 3381;
        System.out.println("Is in law and geater than 30? "+isInLawAndGreaterThan30);
        System.out.println("Is in law and less than 30? "+isInLawAndLessThan30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;
        System.out.println("Dá pra comprar um Playstation 5? "+isPlayStationCincoCompravel);

    }
}
