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
    }
}
