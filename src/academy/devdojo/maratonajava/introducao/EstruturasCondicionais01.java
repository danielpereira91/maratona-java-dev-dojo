package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAutorizadoComprarBebidaAlcolica = age >= 18;

        if (isAutorizadoComprarBebidaAlcolica) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcólica.");
        }

        // !
        if (!isAutorizadoComprarBebidaAlcolica) {
            System.out.println("Não Autorizado a comprar bebida alcólica.");
        }

        boolean c = false;
        if (c = true) { // Está sendo atribuído o valor True a c. Para ser comparado, deveria ser "==".
            System.out.println("Dentro de algo que nunca deve ser feito.");
        }
        System.out.println("Fora do if");
    }
}
