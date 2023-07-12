package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        /*
        Idade < 15: categoria infantil
        Idade >= 15 && < 18: categoria juvenil
        Idade >= 18: categoria adulto
         */
        short idade = 17; // Usei short para ocupar menos espaço
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade < 18) { // Ou (idade >= 15 && idade < 18)
            System.out.println("Categoria Juvenil");
        } else { // Ou else if (idade >= 18)
            System.out.println("Categoria Adulto");
        }
        idade = 12;
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade < 18) { // Ou (idade >= 15 && idade < 18)
            System.out.println("Categoria Juvenil");
        } else { // Ou else if (idade >= 18)
            System.out.println("Categoria Adulto");
        }
        idade = 19;
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade < 18) { // Ou (idade >= 15 && idade < 18)
            System.out.println("Categoria Juvenil");
        } else { // Ou else if (idade >= 18)
            System.out.println("Categoria Adulto");
        }

        idade = 21;
        String categoria = "Sem Categoria";
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade < 18) { // Ou (idade >= 15 && idade < 18)
            categoria = "Categoria Juvenil";
        } else { // Ou else if (idade >= 18)
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
