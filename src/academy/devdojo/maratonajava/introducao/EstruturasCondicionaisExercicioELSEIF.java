package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisExercicioELSEIF {
    public static void main(String[] args) {
        double salarioAnual = 33000;
        double primeiraFaixa = 0.097;
        double segundaFaixa = 0.3735;
        double terceiraFaixa = 0.495;
        double valorImposto;
        double rendaLiquida;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        rendaLiquida = salarioAnual - valorImposto;
        System.out.printf("Seu salário é de €%.2f, seu valor devido final é de €%.2f e você fica com €%.2f.", salarioAnual, valorImposto, rendaLiquida);

        salarioAnual = 57500;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        rendaLiquida= salarioAnual - valorImposto;
        System.out.printf("\nSeu salário é de €%.2f, seu valor devido final é de €%.2f e você fica com €%.2f.", salarioAnual, valorImposto, rendaLiquida);

        salarioAnual = 75452;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        rendaLiquida = salarioAnual - valorImposto;
        System.out.printf("\nSeu salário é de €%.2f, seu valor devido final é de €%.2f e você fica com €%.2f.", salarioAnual, valorImposto, rendaLiquida);
    }
}
