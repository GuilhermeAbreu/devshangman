package br.com.devshangman.JogoDaForca.Jogador;

public class Jogador {

    int id;
    String nome;
    int opcao;
    String dica;

    public Jogador jogador(int id, String nome, int opcao) {

        System.out.println("novo jogador nome: " + nome +" id: "+id);

        Jogador jogador = new Jogador();
        jogador.setId(id);
        jogador.setNome(nome);
        jogador.setLetras(opcao);

        return jogador;

    }

    public Jogador jogador(int id, String nome) {

        System.out.println("novo jogador nome: " + nome +" id: "+id);

        Jogador jogador = new Jogador();
        jogador.setId(id);
        jogador.setNome(nome);
        jogador.setLetras(opcao);

        return jogador;

    }
    
    
    public Jogador(){}

    public void setDica(String dica) {this.dica = dica;}

    public String getDica() {return dica;}

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
