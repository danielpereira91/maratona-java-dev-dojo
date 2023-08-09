package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Local {
    private String endereco;
    private Seminario[] seminarios;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public Local(String endereco, Seminario[] seminarios) {
        this.endereco = endereco;
        this.seminarios = seminarios;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
