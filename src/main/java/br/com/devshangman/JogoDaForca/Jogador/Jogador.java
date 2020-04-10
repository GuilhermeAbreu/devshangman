package br.com.devshangman.JogoDaForca.Jogador;

public class Jogador {

    int id;
    String nome;

    public Jogador CriarJogador(int id, String nome) {

        Jogador jogador = new Jogador();
        jogador.setId(id);
        jogador.setNome(nome);

        return jogador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
