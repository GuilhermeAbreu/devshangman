package br.com.devshangman.JogoDaForca.Jogador;

public class Jogador {

    int id;
    String nome;
    int letras;

    public Jogador(int id, String nome, int letras) {

        //Jogador jogador = new Jogador();
        //jogador.setId(id);
        this.id= id;
        this.nome= nome;
        this.letras = letras;
       // jogador.setNome(nome);
        //return jogador;
        
    }
    
    
    public Jogador(){
        
    
    }
            
          
     public int getLetras() {
        return letras;
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
