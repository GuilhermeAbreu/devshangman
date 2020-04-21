package br.com.devshangman.JogoDaForca;

import br.com.devshangman.JogoDaForca.Audios.Audios;
import br.com.devshangman.JogoDaForca.Boneco.Boneco;
import br.com.devshangman.JogoDaForca.GUI.Nomes;
import br.com.devshangman.JogoDaForca.GUI.TelaLogin;
import br.com.devshangman.JogoDaForca.Jogador.Jogador;
import br.com.devshangman.JogoDaForca.Jogar.Jogar;

import java.util.*;

public class JogoDaForca {

    Audios audios = new Audios();

    public void iniciarJogoforca(){
        //inicinaod som de fundo
        Audios.executaSom("src\\main\\java\\br\\com\\devshangman\\JogoDaForca\\Audios\\sons\\fundo.wav", true);
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.telaInicial();
    }

}
