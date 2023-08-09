package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Seminario {
    private String titulo;
    private Local local;
    private Estudante[] estudantes;
    private Professor2 professor;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Professor2 professor) {
        this.titulo = titulo;
        this.local = local;
        this.professor = professor;
    }

    public Seminario(String titulo, Local local, Estudante[] estudantes, Professor2 professor) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = estudantes;
        this.professor = professor;
    }

    public void imprime() {
        System.out.println("Seminário: " + this.titulo);
        System.out.println("Local: " + local.getEndereco());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Especialidade do professor: " + professor.getEspecialidade());
        if (estudantes == null) {
            System.out.println("Este seminário ainda não tem estudantes inscritos");
        } else {
            System.out.println("Estudantes inscritos");
            for (Estudante estudante : estudantes) {
                System.out.printf("Nome: %s | Idade: %d\n", estudante.getNome(), estudante.getIdade());
            }
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor2 getProfessor() {
        return professor;
    }

    public void setProfessor(Professor2 professor) {
        this.professor = professor;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }
}
