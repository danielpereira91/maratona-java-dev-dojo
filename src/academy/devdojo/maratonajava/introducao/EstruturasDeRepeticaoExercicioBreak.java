package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticaoExercicioBreak {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // valorParcela >= 1000
        double valorCarro = 62000;
        for (int parcela = 1; parcela <= valorCarro ; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
                System.out.printf("Parcela %d: R$%.2f.", parcela, valorParcela);
                System.out.println("");
        }
    }
}
