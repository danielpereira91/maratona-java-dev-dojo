package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Funcionario {
    public String nome;
    public byte idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salarios == null) {
            return;
        }
        System.out.print("Últimos 3 salários: ");
        double media = 0;
        for (double salario : salarios) {
            System.out.print(salario + "  ");
            media += salario;
        }

        media /= salarios.length;

        System.out.println("\n\nMédia salarial: " + media);
    }
}