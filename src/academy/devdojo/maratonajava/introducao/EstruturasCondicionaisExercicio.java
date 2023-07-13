package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salarioAnual = 33000;
        double valorImposto = 0;
        double rendaLiquida = 0;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * 0.097;
        } else if (salarioAnual <= 68507) {
            valorImposto = salarioAnual * 0.3735;
        } else {
            valorImposto = salarioAnual * 0.495;
        }
        rendaLiquida = salarioAnual - valorImposto;
        System.out.printf("Seu salário é de €%.2f, seu valor devido final é de €%.2f e você fica com €%.2f.", salarioAnual, valorImposto, rendaLiquida);

        salarioAnual = 57500;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * 0.097;
        } else if (salarioAnual <= 68507) {
            valorImposto = salarioAnual * 0.3735;
        } else {
            valorImposto = salarioAnual * 0.495;
        }
        rendaLiquida= salarioAnual - valorImposto;
        System.out.printf("\nSeu salário é de €%.2f, seu valor devido final é de €%.2f e você fica com €%.2f.", salarioAnual, valorImposto, rendaLiquida);

        salarioAnual = 75452;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * 0.097;
        } else if (salarioAnual <= 68507) {
            valorImposto = salarioAnual * 0.3735;
        } else {
            valorImposto = salarioAnual * 0.495;
        }
        rendaLiquida = salarioAnual - valorImposto;
        System.out.printf("\nSeu salário é de €%.2f, seu valor devido final é de €%.2f e você fica com €%.2f.", salarioAnual, valorImposto, rendaLiquida);
    }
}
