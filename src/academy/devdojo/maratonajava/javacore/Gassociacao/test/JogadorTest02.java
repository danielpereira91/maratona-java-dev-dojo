package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        jogador1.imprime();
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        System.out.println("<Depois de settar o time>");

        jogador1.imprime();
    }
}
