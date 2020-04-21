package br.com.devshangman.JogoDaForca.Audios;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audios {

    public static void executaSom(String caminho, boolean repetir) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(caminho).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            if(repetir){
                clip.loop(999);
            }
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM: " + caminho);
            ex.printStackTrace();
        }
    }

}
