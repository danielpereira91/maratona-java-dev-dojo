package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima os primeira 25 número de um dado valor. Por exemplo, 50.
        for (int i = 0; i <= 50; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
