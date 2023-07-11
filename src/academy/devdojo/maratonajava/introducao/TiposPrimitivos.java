package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        double salaryInt = (int) 3457.89; // Casting - não vai aparecer o decimal pois foi dado Casting para transformar o valor em inteiro
        long universeAge = 13800000000l; // "l" no final para especificar que é um inteiro grande.
        double salaryDouble = 2000.0; // Aceita o ponto sem precisar colocar o "d" no final, mas pode colocar também
        float salaryFloat = 2500.0f; // Se não colocar o "f" no final, o Java solicita que seja mudado para Double
        byte ageByte = 10;
        short ageShort = 10;
        boolean truth = true;
        boolean fake = false;
        String word; // Era para ser "char" porém o Java fica forçando mudar para String (String não é tipo primitivo, é tipo de referência
        word = "C";
        char asciiTable = 68;
        char uniCode = '\u004C';
        String name = "Goku";


        System.out.println(age);
        System.out.println("A idade é "+age+" anos.");
        System.out.println(truth);
        System.out.println(fake);
        System.out.println(uniCode + "uísa");
        System.out.println(word + "amila");
        System.out.println(asciiTable + "aniel");
        System.out.println("Age of the Universe: " + universeAge);
        System.out.println(salaryInt);
        System.out.println("Hey! I'm "+name+".");
    }
}
