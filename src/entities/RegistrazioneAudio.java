package entities;

import interfaces.RegolaVolume;
import interfaces.Riproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile, RegolaVolume {

    //Attributi protected perchè ora mi servono per Video
    protected int durata;
    protected int volume;

    //Costruttore
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    //Metodi
    @Override
    public void aumentaVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume aumentato a: " + volume);
        } else {
            System.out.println("Volume già al massimo");
        }


    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuito a: " + volume);
        } else {
            System.out.println("Volume già al minimo!");
        }
    }

    @Override
    public void esegui() {
        play();
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
}
