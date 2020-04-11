package br.com.devshangman.JogoDaForca.Palavras;

import java.util.Random;

public class Palavras {

    String[] palavraComDica = new String[47];

    String palavra;
    String dica;

    public void setPalavraComDiga() {
        this.palavraComDica[0] = "barbeiro;Nome de inseto";
        this.palavraComDica[1] = "sapo;Nome de Animal";
        this.palavraComDica[2] = "vaca;Nome de Animal";
        this.palavraComDica[3] = "rato;Nome de Animal";
        this.palavraComDica[4] = "urso;Nome de Animal";
        this.palavraComDica[5] = "tatu;Nome de Animal";
        this.palavraComDica[6] = "jaca;Nome de Comida";
        this.palavraComDica[7] = "kiwi;Nome de Comida";
        this.palavraComDica[8] = "pera;Nome de Comida";
        this.palavraComDica[9] = "lima;Nome de Comida";
        this.palavraComDica[10] = "cupu;Nome de Comida";
        this.palavraComDica[11] = "peru;Nome de Lugar";
        this.palavraComDica[12] = "para;Nome de Lugar";
        this.palavraComDica[13] = "cuba;Nome de Lugar";
        this.palavraComDica[14] = "roma;Nome de Lugar";
        this.palavraComDica[15] = "laos;Nome de Lugar";
        this.palavraComDica[16] = "formiga;Nome de inseto";
        this.palavraComDica[17] = "cotia;Nome de Animal";
        this.palavraComDica[18] = "urubu;Nome de Animal";
        this.palavraComDica[19] = "tigre;Nome de Animal";
        this.palavraComDica[20] = "cobra;Nome de Animal";
        this.palavraComDica[21] = "zebra;Nome de Animal";
        this.palavraComDica[22] = "arroz;Nome de Comida";
        this.palavraComDica[23] = "cacau;Nome de Comida";
        this.palavraComDica[24] = "piqui;Nome de Comida";
        this.palavraComDica[25] = "pizza;Nome de Comida";
        this.palavraComDica[26] = "manga;Nome de Comida";
        this.palavraComDica[27] = "nepal;Nome de Lugar";
        this.palavraComDica[28] = "goias;Nome de Lugar";
        this.palavraComDica[29] = "chile;Nome de Lugar";
        this.palavraComDica[30] = "haiti;Nome de Lugar";
        this.palavraComDica[31] = "paris;Nome de Lugar";
        this.palavraComDica[32] = "cavalo;Nome de Animal";
        this.palavraComDica[33] = "macaco;Nome de Animal";
        this.palavraComDica[34] = "lontra;Nome de Animal";
        this.palavraComDica[35] = "jacare;Nome de Animal";
        this.palavraComDica[36] = "gorila;Nome de Animal";
        this.palavraComDica[37] = "banana;Nome de Comida";
        this.palavraComDica[38] = "tomate;Nome de Comida";
        this.palavraComDica[39] = "cereja;Nome de Comida";
        this.palavraComDica[40] = "alface;Nome de Comida";
        this.palavraComDica[41] = "goiaba;Nome de Comida";
        this.palavraComDica[42] = "recife;Nome de Lugar";
        this.palavraComDica[43] = "olinda;Nome de Lugar";
        this.palavraComDica[44] = "iraque;Nome de Lugar";
        this.palavraComDica[45] = "russia;Nome de Lugar";
        this.palavraComDica[46] = "coreia;Nome de Lugar";
    }

    public void buscarPalavraComDica(){
        Random random = new Random();
        splitDoPalavraComDica(this.palavraComDica[random.nextInt(this.palavraComDica.length)]);
    }

    public void splitDoPalavraComDica(String palavraComDica){
        String[] palavraComDicasplit;
        palavraComDicasplit = palavraComDica.split(";");
        setPalavra(palavraComDicasplit[0]);
        setDica(palavraComDicasplit[1]);
    }


    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getDica() {
        return dica;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }
}
