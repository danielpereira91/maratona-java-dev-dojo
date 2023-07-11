package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        double salaryDouble = 2000;
        float salaryFloat = 2500;
        byte ageByte = 10;
        short ageShort = 10;
        boolean truth = true;
        boolean fake = false;
        String word; // Era para ser "char" porém o IntelliJ fica forçando mudar para String
        word = "C";
        char asciiTable = 68;
        char uniCode = '\u004C';

        System.out.println(age);
        System.out.println("A idade é "+age+" anos.");
        System.out.println(truth);
        System.out.println(fake);
        System.out.println(uniCode + "uísa");
        System.out.println(word + "amila");
        System.out.println(asciiTable + "aniel");
    }
}
