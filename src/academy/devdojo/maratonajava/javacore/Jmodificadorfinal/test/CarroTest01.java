package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        // Carro.VELOCIDADE_LIMITE = 180; Não funciona pois a variável VELOCIDADE_LIMITE é constante.
        System.out.println(Carro.VELOCIDADE_LIMITE);
    }
}
