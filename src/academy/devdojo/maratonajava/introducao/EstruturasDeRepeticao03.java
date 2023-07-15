package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        double valorCarro = 62000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
        }
    }
}
