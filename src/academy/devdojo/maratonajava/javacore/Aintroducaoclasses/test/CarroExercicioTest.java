package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.CarroExercicio;

public class CarroExercicioTest {
    public static void main(String[] args) {
        CarroExercicio carro1 = new CarroExercicio();
        CarroExercicio carro2 = new CarroExercicio();

        carro1.nome = "Nissan";
        carro1.modelo = "Versa";
        carro1.ano = 2017;

        carro2.nome = "Peugeot";
        carro2.modelo = "3008";
        carro2.ano = 2025;

        System.out.printf("Nome: %s\nModelo: %s\nAno: %d", carro1.nome, carro1.modelo, carro1.ano);
        System.out.println("\n----------------------------");
        System.out.printf("Nome: %s\nModelo: %s\nAno: %d", carro2.nome, carro2.modelo, carro2.ano);
    }
}
