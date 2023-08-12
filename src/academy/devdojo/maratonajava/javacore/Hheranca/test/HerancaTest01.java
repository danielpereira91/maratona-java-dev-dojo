package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("01234-567");
        endereco.setRua("Rua 3700");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setEndereco(endereco);
        pessoa.setCpf("012.345.678-90");

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("123.456.789.10");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("-----------");
        funcionario.imprime();
        System.out.println("-----------");

        funcionario.relatorioPagamento();
    }
}
