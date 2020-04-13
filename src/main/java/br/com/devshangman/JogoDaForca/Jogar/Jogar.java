package br.com.devshangman.JogoDaForca.Jogar;
import br.com.devshangman.JogoDaForca.Boneco.Boneco;
import br.com.devshangman.JogoDaForca.Console.Console;
import br.com.devshangman.JogoDaForca.Jogador.Jogador;
import br.com.devshangman.JogoDaForca.Palavras.Palavras;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Jogar {

    List<Jogador> jogadores;
    Boneco boneco = new Boneco();
    Palavras palavras = new Palavras();
    String palavraOculta = "";
    String letrasDigitadas = "";
    String[] letrasDasPlarvas;

    public void iniciaJogoDaForca(List<Jogador> jogadores){
        this.letrasDigitadas = "";
        this.palavraOculta = "";
        setJogadores(jogadores);
        palavras.setPalavraComDiga();
        palavras.buscarPalavraComDica();
        boneco.reiniciarBoneco();
        boneco.setPartesDoBoneco();
        splitarPalavaParaletrasUnicas(palavras);
        jogoDaForca(palavras);
    }

    private void splitarPalavaParaletrasUnicas(Palavras palavras){

        letrasDasPlarvas = palavras.getPalavra().split("");

    }


    public void jogoDaForca(Palavras palavras){

        while (getErros() < getBoneco().length - 1){
            Scanner scanner = new Scanner(System.in);
            escreverBoneco();
            System.out.println("Letras digitadas: "+ getLetrasDigitadas());
            System.out.println("Letras a certadas: "+getPalavraOculta());
            String letra = scanner.nextLine();
            validarResposta(letra);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("deseja continuar? (1) sim ou (2) não:");
        boolean valido = true;
        while (valido){
            try {
                int opcao = scanner.nextInt();

                if(opcao == 1){
                    iniciaJogoDaForca(jogadores);
                    valido = false;
                }else if(opcao == 2){
                    exit(-1);
                    valido = false;
                }else{
                    System.out.println("Opção digitada invalida não encontrada");
                }

            }catch (InputMismatchException e){
                System.err.println("Opção invalida");
            }
        }

    }

    private void validarResposta(String letra){

        int letters = 0;

        String[] letrasSeparadas = letra.split("");

        //contar a quantidade de letras
        for(int i = 0; i < getPalavra().length(); i++){
            if(Character.isLetter(getPalavra().charAt(i)))
                letters++;
        }

        for(String letras : letrasSeparadas){
            int possicaoLetra = 0;
            int count = 0;

            for(String letrasDapalavraGerada : letrasDasPlarvas){
                if(letras.equals(letrasDapalavraGerada)){
                    computadarAcerto(letras, possicaoLetra);
                }else{
                    count ++;
                    if(letters == count)
                    {
                        setErro();
                    }
                }
                possicaoLetra++;
            }
            letrasDigitadas(letras);
        }

    }

    private void adicionarEspaco(){

        Console console = new Console();
        console.deletar_conteudo_do_console();

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


    public String getPalavraOculta() {
        return palavraOculta;
    }

    public String getLetrasDigitadas() {
        return letrasDigitadas;
    }

    public void computadarAcerto(String letras, int possisao){
        this.palavraOculta += letras;
    }

    public void letrasDigitadas(String letras){
        this.letrasDigitadas += letras+",";
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Jogador quemDevejogarAgora(){
        return this.jogadores.get(0);
    }

}
