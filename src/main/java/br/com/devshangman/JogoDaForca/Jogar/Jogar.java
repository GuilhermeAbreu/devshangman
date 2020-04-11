package br.com.devshangman.JogoDaForca.Jogar;
import br.com.devshangman.JogoDaForca.Boneco.Boneco;
import br.com.devshangman.JogoDaForca.Console.Console;
import br.com.devshangman.JogoDaForca.Jogador.Jogador;
import br.com.devshangman.JogoDaForca.Palavras.Palavras;
import java.util.List;
import java.util.Scanner;

public class Jogar {

    List<Jogador> jogadores;
    Boneco boneco = new Boneco();

    public void iniciaJogoDaForca(List<Jogador> jogadores){
        setJogadores(jogadores);
        Palavras palavras = new Palavras();
        palavras.setPalavraComDiga();
        palavras.buscarPalavraComDica();
        boneco.setPartesDoBoneco();
        jogoDaForca(palavras);
    }

    public void escreverBoneco(){
        boneco.montarBoneco();
    }

    public int getErros(){
        return boneco.getTotaldeErros();
    }

    public String[] getBoneco(){
        return boneco.getPartesDoBoneco();
    }

    public void setErro(){
        boneco.setTotaldeErros();
    }

    public void jogoDaForca(Palavras palavras){

        while (getErros() < getBoneco().length){
            Scanner scanner = new Scanner(System.in);
            escreverBoneco();
            String s = scanner.nextLine();
            setErro();
        }

    }

    private void adicionarEspaco(){

        Console console = new Console();
        console.deletar_conteudo_do_console();

    }


    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador quemDevejogarAgora(){
        return this.jogadores.get(0);
    }

}
