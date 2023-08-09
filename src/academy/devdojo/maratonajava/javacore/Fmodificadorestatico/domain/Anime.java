package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de Inicialização é executado quando a JVM carregar a Classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de lasse é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    // Bloco de inicialização
    static {
        System.out.println("Inicialização Bloco Estático");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    {
        System.out.println("Inicialização Bloco Não-Estático");
    }

    public Anime(String nome) { // construtor
        this.nome = nome;
    }

    public Anime() { // construtor
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
