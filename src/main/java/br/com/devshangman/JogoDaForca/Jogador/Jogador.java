package br.com.devshangman.JogoDaForca.Jogador;

public class Jogador {

    int id;
    String nome;
    int opcao;

    public Jogador jogador(int id, String nome, int opcao) {

        Jogador jogador = new Jogador();
        jogador.setId(id);
        jogador.setNome(nome);
        jogador.setLetras(opcao);

        return jogador;

    }

    public Jogador jogador(int id, String nome) {

        Jogador jogador = new Jogador();
        jogador.setId(id);
        jogador.setNome(nome);
        jogador.setLetras(opcao);

        return jogador;

    }
    
    
    public Jogador(){}

    public void setLetras(int opcao) { this.opcao = opcao; }

    public int getLetras() {
        return opcao;
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
