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
    Palavras palavras = new Palavras();
    String palavraOculta;
    String letrasDigitadas;
    String[] letrasDasPlarvas;

    public void iniciaJogoDaForca(List<Jogador> jogadores){
        setJogadores(jogadores);
        palavras.setPalavraComDiga();
        palavras.buscarPalavraComDica();
        boneco.setPartesDoBoneco();
        splitarPalavaParaletrasUnicas(palavras);
        jogoDaForca(palavras);
    }

    private void splitarPalavaParaletrasUnicas(Palavras palavras){

        letrasDasPlarvas = palavras.getPalavra().split("");

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

    public String getPalavra(){
        return palavras.getPalavra();
    }

    public void jogoDaForca(Palavras palavras){

        while (getErros() < getBoneco().length){
            Scanner scanner = new Scanner(System.in);
            escreverBoneco();
            String letra = scanner.nextLine();
            validarResposta(letra);
        }

    }

    private void validarResposta(String letra){

        int letters = 0;
        int count = 0;

        String[] letrasSeparadas = letra.split("");

        //contar a quantidade de letras
        for(int i = 0; i < getPalavra().length(); i++){
            if(Character.isLetter(getPalavra().charAt(i)))
                letters++;
        }
        System.out.println("a palavra é: " + getPalavra() + " e a quantidade de letras é: " + letters);
        
        
        
        for(String letras : letrasSeparadas){

            for(String letrasDapalavraGerada : letrasDasPlarvas){
                    
                if(letras.equals(letrasDapalavraGerada)){
                    System.out.println("Letra " + letras + " tem na palavra");
                }else{
                    
                    count ++;
                    System.out.println("Letra " + letras + " não tem na palavra");
                    if(letters == count)
                    {
                        setErro();
                    }
                }

            }

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
