package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Nissan";
        carro1.modelo = "Versa";
        carro1.ano = 2017;

        carro2.nome = "Peugeot";
        carro2.modelo = "3008";
        carro2.ano = 2025;

        // carro1 = carro2; // Referência de Objetos
        // carro2 = carro1;

        System.out.printf("Carro 1\nNome: %s\nModelo: %s\nAno: %d", carro1.nome, carro1.modelo, carro1.ano);
        System.out.println("\n---------------");
        System.out.printf("Carro 2\nNome: %s\nModelo: %s\nAno: %d", carro2.nome, carro2.modelo, carro2.ano);
    }
}
