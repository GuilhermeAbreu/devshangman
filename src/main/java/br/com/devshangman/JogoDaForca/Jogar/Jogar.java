package br.com.devshangman.JogoDaForca.Jogar;
import br.com.devshangman.JogoDaForca.Jogador.Jogador;
import br.com.devshangman.JogoDaForca.Palavras.Palavras;
import java.util.List;

public class Jogar {

    List<Jogador> jogadores;

    public void iniciaJogoDaForca(List<Jogador> jogadores){
        setJogadores(jogadores);
        Palavras palavras = new Palavras();
        palavras.setPalavraComDiga();
        palavras.buscarPalavraComDica();
        jogoDaForca(palavras);
    }

    public void jogoDaForca(Palavras palavras){



    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador quemDevejogarAgora(){
        return this.jogadores.get(0);
    }

}
