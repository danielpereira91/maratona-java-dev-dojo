package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.print("Nome: " + professor.nome);
        System.out.print(" Idade: " + professor.idade);
        System.out.print(" Sexo: " + professor.sexo);
    }
}
