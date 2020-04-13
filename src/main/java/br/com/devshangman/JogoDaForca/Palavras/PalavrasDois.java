package br.com.devshangman.JogoDaForca.Palavras;

public class PalavrasDois {

    
    String palavrasUm;
    String palavrasDois;

    public PalavrasDois(String palavrasUm, String palavrasDois){

        //Jogador jogador = new Jogador();
        //jogador.setId(id);
        this.palavrasUm= palavrasUm;
        this.palavrasDois= palavrasDois;
        
       // jogador.setNome(nome);
        //return jogador;
        
    }
    
    
    public PalavrasDois(){
        
    
    }
            
          

    
    
    
    
    public String getPalavrasUm() {
        return palavrasUm;
    }

    public void getPalavrasUm(String palavrasUm) {
        this.palavrasUm = palavrasUm;
    }

    public String getPalavrasDois() {
        return palavrasDois;
    }

    public void setPalavrasDois(String palavrasDois) {
        this.palavrasDois = palavrasDois;
    }
}
