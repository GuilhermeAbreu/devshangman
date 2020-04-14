package br.com.devshangman.JogoDaForca.Boneco;

public class Boneco {

    String[] partesDoBoneco = new String[7];
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

        this.partesDoBoneco[1] ="" +
                "\t   |████|                       ■■   \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |▀▀▀▀█████▀▀▀▀█████▀▀▀▀▀▀▀▀▀▀▀▀▀▀■■▀▀|    \n" +
                "       |████|  /████/               ■■       \n" +
                "       |████|/████/                @■■@       \n" +
                "       |████████/               @■ ,,,, ■@    \n" +
                "       |██████/               @■ §§§§§§§§ ■@      \n" +
                "       |████/                @■ §§§§§§§§§§ ■@      \n" +
                "       |████|               (*■ §| O  O |§ ■*) \n" +
                "       |████|                @■  (  └   )  ■@   \n" +
                "       |████|                 @■  \\ == /  ■@   \n" +
                "       |████|                  @■ \\\\--// ■@   \n" +
                "       |████|                      @■■@          \n" +
                "       |████|                    \n" +
                "       |████|                        \n" +
                "       |████|                        \n" +
                "       |████|                         \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|\n" +
                "\t   |████|\n" +
                "\t |████████|\t \n" +
                "\t |████████|\t   \n" +
                " |████████████████|\t";
        this.partesDoBoneco[2] ="" +
                "\t   |████|                       ■■   \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |▀▀▀▀█████▀▀▀▀█████▀▀▀▀▀▀▀▀▀▀▀▀▀▀■■▀▀|    \n" +
                "       |████|  /████/               ■■       \n" +
                "       |████|/████/                @■■@       \n" +
                "       |████████/               @■ ,,,, ■@    \n" +
                "       |██████/               @■ §§§§§§§§ ■@      \n" +
                "       |████/                @■ §§§§§§§§§§ ■@      \n" +
                "       |████|               (*■ §| O  O |§ ■*) \n" +
                "       |████|                @■  (  └   )  ■@   \n" +
                "       |████|                 @■  \\ == /  ■@   \n" +
                "       |████|                  @■ \\\\--// ■@   \n" +
                "       |████|                 /@▓▓▓@■■@▓▓▓@\\          \n" +
                "       |████|                    ▒▒▒▒▒▒▒▒      \n" +
                "       |████|                    ▓▓▓▓▓▓▓▓      \n" +
                "       |████|                    ▒▒▒▒▒▒▒▒      \n" +
                "       |████|                    ▓▓▓▓▓▓▓▓      \n" +
                "       |████|                    ▒▒▒▒▒▒▒▒      \n" +
                "       |████|                    ▓▓▓▓▓▓▓▓      \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|\n" +
                "\t   |████|\n" +
                "\t |████████|\t \n" +
                "\t |████████|\t   \n" +
                " |████████████████|";
        this.partesDoBoneco[3] ="" +
                " \t   |████|                       ■■   \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |▀▀▀▀█████▀▀▀▀█████▀▀▀▀▀▀▀▀▀▀▀▀▀▀■■▀▀|    \n" +
                "       |████|  /████/               ■■       \n" +
                "       |████|/████/                @■■@       \n" +
                "       |████████/               @■ ,,,, ■@    \n" +
                "       |██████/               @■ §§§§§§§§ ■@      \n" +
                "       |████/                @■ §§§§§§§§§§ ■@      \n" +
                "       |████|               (*■ §| O  O |§ ■*) \n" +
                "       |████|                @■  (  └   )  ■@   \n" +
                "       |████|                 @■  \\ == /  ■@   \n" +
                "       |████|                  @■ \\\\--// ■@   \n" +
                "       |████|                 /@▓▓▓@■■@▓▓▓@\\          \n" +
                "       |████|                /▒▒/▒▒▒▒▒▒▒▒     \n" +
                "       |████|               /▓▓/ ▓▓▓▓▓▓▓▓     \n" +
                "       |████|              |▒▒|  ▒▒▒▒▒▒▒▒    \n" +
                "       |████|              |▓▓|  ▓▓▓▓▓▓▓▓     \n" +
                "       |████|              /||\\  ▒▒▒▒▒▒▒▒     \n" +
                "       |████|              ╣║║║  ▓▓▓▓▓▓▓▓     \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|\n" +
                "\t   |████|\n" +
                "\t |████████|\t \n" +
                "\t |████████|\t   \n" +
                " |████████████████|";
        this.partesDoBoneco[4] ="" +
                "  \t   |████|                       ■■   \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |▀▀▀▀█████▀▀▀▀█████▀▀▀▀▀▀▀▀▀▀▀▀▀▀■■▀▀|    \n" +
                "       |████|  /████/               ■■       \n" +
                "       |████|/████/                @■■@       \n" +
                "       |████████/               @■ ,,,, ■@    \n" +
                "       |██████/               @■ §§§§§§§§ ■@      \n" +
                "       |████/                @■ §§§§§§§§§§ ■@      \n" +
                "       |████|               (*■ §| O  O |§ ■*) \n" +
                "       |████|                @■  (  └   )  ■@   \n" +
                "       |████|                 @■  \\ == /  ■@   \n" +
                "       |████|                  @■ \\\\--// ■@   \n" +
                "       |████|                 /@▓▓▓@■■@▓▓▓@\\          \n" +
                "       |████|                /▒▒/▒▒▒▒▒▒▒▒\\▒▒\\      \n" +
                "       |████|               /▓▓/ ▓▓▓▓▓▓▓▓ \\▓▓\\     \n" +
                "       |████|              |▒▒|  ▒▒▒▒▒▒▒▒  |▒▒|    \n" +
                "       |████|              |▓▓|  ▓▓▓▓▓▓▓▓  |▓▓|   \n" +
                "       |████|              /||\\  ▒▒▒▒▒▒▒▒  /||\\    \n" +
                "       |████|              ╣║║║  ▓▓▓▓▓▓▓▓  ║║║╠   \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|                          \n" +
                "       |████|\n" +
                "\t   |████|\n" +
                "\t |████████|\t \n" +
                "\t |████████|\t   \n" +
                " |████████████████|";
        this.partesDoBoneco[5] ="" +
                "       |████|                       ■■   \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |▀▀▀▀█████▀▀▀▀█████▀▀▀▀▀▀▀▀▀▀▀▀▀▀■■▀▀|    \n" +
                "       |████|  /████/               ■■       \n" +
                "       |████|/████/                @■■@       \n" +
                "       |████████/               @■ ,,,, ■@    \n" +
                "       |██████/               @■ §§§§§§§§ ■@      \n" +
                "       |████/                @■ §§§§§§§§§§ ■@      \n" +
                "       |████|               (*■ §| O  O |§ ■*) \n" +
                "       |████|                @■  (  └   )  ■@   \n" +
                "       |████|                 @■  \\ == /  ■@   \n" +
                "       |████|                  @■ \\\\--// ■@   \n" +
                "       |████|                 /@▓▓▓@■■@▓▓▓@\\          \n" +
                "       |████|                /▒▒/▒▒▒▒▒▒▒▒\\▒▒\\      \n" +
                "       |████|               /▓▓/ ▓▓▓▓▓▓▓▓ \\▓▓\\     \n" +
                "       |████|              |▒▒|  ▒▒▒▒▒▒▒▒  |▒▒|    \n" +
                "       |████|              |▓▓|  ▓▓▓▓▓▓▓▓  |▓▓|   \n" +
                "       |████|              /||\\  ▒▒▒▒▒▒▒▒  /||\\    \n" +
                "       |████|              ╣║║║  ▓▓▓▓▓▓▓▓  ║║║╠    \n" +
                "       |████|                    ████████      \n" +
                "       |████|                    ███/\\███    \n" +
                "       |████|                    ███  ███ \n" +
                "       |████|                    |o|  \n" +
                "       |████|                    | |   \n" +
                "       |████|                    | |    \n" +
                "       |████|                    ███ \n" +
                "\t   |████|\n" +
                "\t |████████|\t \n" +
                "\t |████████|\t   \n" +
                " |████████████████|\n";

        this.partesDoBoneco[6] ="" +
                "       |████|                       ■■   \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |████████████████████████████████■■██|    \n" +
                "   |▀▀▀▀█████▀▀▀▀█████▀▀▀▀▀▀▀▀▀▀▀▀▀▀■■▀▀|    \n" +
                "       |████|  /████/               ■■       \n" +
                "       |████|/████/                @■■@       \n" +
                "       |████████/               @■ ,,,, ■@    \n" +
                "       |██████/               @■ §§§§§§§§ ■@      \n" +
                "       |████/                @■ §§§§§§§§§§ ■@      \n" +
                "       |████|               (*■ §| O  O |§ ■*) \n" +
                "       |████|                @■  (  └   )  ■@   \n" +
                "       |████|                 @■  \\ == /  ■@   \n" +
                "       |████|                  @■ \\\\--// ■@   \n" +
                "       |████|                 /@▓▓▓@■■@▓▓▓@\\          \n" +
                "       |████|                /▒▒/▒▒▒▒▒▒▒▒\\▒▒\\      \n" +
                "       |████|               /▓▓/ ▓▓▓▓▓▓▓▓ \\▓▓\\     \n" +
                "       |████|              |▒▒|  ▒▒▒▒▒▒▒▒  |▒▒|    \n" +
                "       |████|              |▓▓|  ▓▓▓▓▓▓▓▓  |▓▓|   \n" +
                "       |████|              /||\\  ▒▒▒▒▒▒▒▒  /||\\    \n" +
                "       |████|              ╣║║║  ▓▓▓▓▓▓▓▓  ║║║╠    \n" +
                "       |████|                    ████████      \n" +
                "       |████|                    ███/\\███    \n" +
                "       |████|                    ███  ███ \n" +
                "       |████|                    |o|  |o| \n" +
                "       |████|                    | |  | |      \n" +
                "       |████|                    | |  | |      \n" +
                "       |████|                    ███  ███\n" +
                "\t   |████|\n" +
                "\t |████████|\t \n" +
                "\t |████████|\t   \n" +
                " |████████████████|\n";
    }

    public void montarBoneco(){
        System.out.println(this.partesDoBoneco[getTotaldeErros()]);
    }

    public void setTotaldeErros() {
        TotaldeErros++;
    }

    public void reiniciarBoneco() {
        TotaldeErros = 0;
    }

    public int getTotaldeErros() {
        return TotaldeErros;
    }

    public String[] getPartesDoBoneco() {
        return partesDoBoneco;
    }
}
