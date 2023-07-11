package academy.devdojo.maratonajava.introducao;


/**
 * <b>Exercício</b><br><br>
 * Crie variáveis para os campos descritos abaixo em <b><span style = "color: red;">vermelho</span></b> e imprima a seguinte mensagem:<br><br>
 *
 * Eu, <b><span style = "color: red;">nome</span></b>, morando no endereço <b><span style = "color: red;">endereco</span></b>,<br>
 * confirmo que recebi o salário de <b><span style = "color: red;">salario</span></b>, na data <b><span style = "color: red;">data<span></span></b>.
 */
public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Daniel Teixeira Pereira";
        String endereco = "Rua 3604, 165 - Edifício Dom Gabriel - Centro - Balneário Camboriú-SC";
        double salario = 4337.87;
        String dataRecebimentoSalario = "04-mar-2024";

        System.out.printf("Eu, %s, morando no endereço %s,%n confirmo que recebi o salário de %.2f na data %s.", nome, endereco, salario, dataRecebimentoSalario);
    }

}
