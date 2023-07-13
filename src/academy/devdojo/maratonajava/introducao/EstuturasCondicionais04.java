package academy.devdojo.maratonajava.introducao;

public class EstuturasCondicionais04 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;
        // Se fosse com o if, ficaria assim (utilizando operador ternário para não escrever cada else if
        String diaDaSemana = dia == 1 ? "Domingo" : dia == 2 ? "Segunda-Feira" : dia == 3 ? "Terça-Feira" : dia == 4 ? "Quarta-Feira" : dia == 5 ? "Quinta-Feira" : dia == 6 ? "Sexta-Feira" : dia == 7 ? "Sábado" : "Este dia não existe nos número de semana";
        System.out.println(diaDaSemana);
        dia = 8;
        diaDaSemana = dia == 1 ? "Domingo" : dia == 2 ? "Segunda-Feira" : dia == 3 ? "Terça-Feira" : dia == 4 ? "Quarta-Feira" : dia == 5 ? "Quinta-Feira" : dia == 6 ? "Sexta-Feira" : dia == 7 ? "Sábado" : "Este dia não existe na semana";
        System.out.println(diaDaSemana);

        // switch
        dia = 4;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }

        dia = 10;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }

        String sexo = "M";
        switch (sexo) {
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

    }
}
