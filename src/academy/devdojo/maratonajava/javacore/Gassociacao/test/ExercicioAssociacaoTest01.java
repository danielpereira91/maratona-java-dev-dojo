package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Estudante;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor2;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminario;

public class ExercicioAssociacaoTest01 {
    public static void main(String[] args) {
        Local local1 = new Local("Rua Papai Noel, 180");
        Local local2 = new Local("Rua Coelhinho da Páscoa, 360");
        Local local3 = new Local("Hogwarts");
        Professor2 professor1 = new Professor2("Timão e Pumba", "Hakuna Matata");
        Professor2 professor2 = new Professor2("Albus Dumblodore", "Aparatar");
        Estudante estudante1 = new Estudante("Simba", 13);
        Estudante estudante2 = new Estudante("Harry Potter", 17);
        Estudante estudante3 = new Estudante("Tom Riddle", 75);
        Estudante estudante4 = new Estudante("Nala", 13);
        Seminario seminario1 = new Seminario("Aprenda a vender curso sobre vender curso", local1);
        Seminario seminario2 = new Seminario("Como ser um trouxa", local3);
        Seminario seminario3 = new Seminario("Rir na cara do perigo", local2);

        seminario1.setProfessor(professor1);

        seminario2.setProfessor(professor2);
        seminario2.setEstudantes(new Estudante[]{estudante2, estudante3});

        seminario3.setProfessor(professor1);
        seminario3.setEstudantes(new Estudante[]{estudante1, estudante4});

        seminario1.imprime();
        System.out.println("--------------------------");
        seminario2.imprime();
        System.out.println("--------------------------");
        seminario3.imprime();

    }
}
