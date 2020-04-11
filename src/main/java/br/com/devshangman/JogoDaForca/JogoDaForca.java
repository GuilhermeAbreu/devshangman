package br.com.devshangman.JogoDaForca;

import br.com.devshangman.JogoDaForca.Audios.Audios;
import br.com.devshangman.JogoDaForca.Boneco.CriarBoneco;
import br.com.devshangman.JogoDaForca.Jogador.Jogador;
import br.com.devshangman.JogoDaForca.Jogar.Jogar;

import java.util.*;

public class JogoDaForca {

    Audios audios = new Audios();
    CriarBoneco boneco = new CriarBoneco();

    public void iniciarJogoforca(){
        Audios.executaSom("D:\\mario.wav");
        boneco.setPartesDoBoneco();
        jogoDaForca();
    }

    public void modoDejogo(int opcao){

        int i = 1;

        List<Jogador> jogadores = new ArrayList<>();
        Jogador jogador = new Jogador();

        while (i <= opcao){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Jogador "+i+" :");
            String nome = scanner.nextLine();

            if(nome.length() > 3){
                jogadores.add(jogador.CriarJogador(i, nome));
                i++;
            }else{
                System.out.println("Acima de 3 digitos");
            }

        }

        System.out.println("Jogadores: ");

        for (Jogador dadosJogador : jogadores) {
            System.out.println("Jogador " + dadosJogador.getId() + ": " + dadosJogador.getNome());
        }

        Jogar jogar = new Jogar();
        jogar.iniciaJogoDaForca(jogadores);
    }

    public void jogoDaForca(){
        System.out.println("" +
                "██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\n"+
                "███                                    _    _          _   _  _____ __  __          _   _                                  ███\n"+
                "███                                   | |__| |  /  \\  |  \\| | |  __| \\  / |  /  \\  |  \\| |                                 ███\n"+
                "███                                   |  __  | / /\\ \\ | . ` | | |_ | |\\/| | / /\\ \\ | . ` |                                 ███\n"+
                "███                                   | |  | |/ ____ \\| |\\  | |__| | |  | |/ ____ \\| |\\  |                                 ███\n"+
                "███                                   |_|  |_/_/    \\_\\_| \\_|\\_____|_|  |_/_/    \\_\\_| \\_|                                 ███\n"+
                "███                                                                                                                        ███\n"+
                "██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\n\n"+
                "                                                  Selecione o Mode de Jogo \n \n"+
                "                                                        (1) SinglePlay \n"+
                "                                                        (2) MultiPlay \n \n"+
                "██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████\n"
        );

        boolean valido = true;

        while (valido){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite uma opção");
            try{
                int opcao = scanner.nextInt();

                if(opcao == 1 || opcao == 2){
                    modoDejogo(opcao);
                    valido = false;
                }else{
                    System.err.println("Opção invalida, digite 1 ou 2");
                    valido = true;
                }

            } catch (InputMismatchException e) {
                valido = true;
                System.err.println("Digite apenas numeros");
            }
        }

    }

}
