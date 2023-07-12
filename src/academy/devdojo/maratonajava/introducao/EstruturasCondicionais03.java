package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado;
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        salario = 4000;
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        // Operador Ternário (condição) ? verdadeiro : falso
        resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        salario = 6000;
        System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);

        // Forma correta de se usar
        resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter";
        System.out.println(resultado);
    }
}
