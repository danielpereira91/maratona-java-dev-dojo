package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count += 1;
        }

        System.out.println("");

        count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        System.out.println("");

        count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        System.out.println("");

        count = 0;
        do {
            System.out.println(++count+" Dentro do 'do-while'");
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For "+i);
        }
    }
}
