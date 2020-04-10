package br.com.devshangman.JogoDaForca.Boneco;

public class CriarBoneco {

    String[] partesDoBoneco = new String[6];
    int TotaldeErros = 0;

    public void setPartesDoBoneco() {
        this.partesDoBoneco[0] = "       |████|                       ■■   \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |▀▀▀▀█████▀▀▀▀█████▀▀▀▀▀▀▀▀▀▀▀▀▀▀■■▀▀|    \n" +
                "       |████|  /████/               ■■       \n" +
                "       |████|/████/                @■■@       \n" +
                "       |████████/               @■      ■@    \n" +
                "       |██████/               @■          ■@      \n" +
                "       |████/                @■            ■@      \n" +
                "       |████|               (*■            ■*) \n" +
                "       |████|                @■            ■@   \n" +
                "       |████|                 @■          ■@   \n" +
                "       |████|                  @■        ■@   \n" +
                "       |████|                      @■■@          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|  ";

        this.partesDoBoneco[1] ="";
        this.partesDoBoneco[2] ="";
        this.partesDoBoneco[3] ="";
        this.partesDoBoneco[4] ="";
        this.partesDoBoneco[5] ="";


    }

    public String montarBoneco(){

        return partesDoBoneco[getTotaldeErros()];

    }

    public void reiniciarBoneco() {
        TotaldeErros = 0;
    }

    public int getTotaldeErros() {
        return TotaldeErros;
    }

}
