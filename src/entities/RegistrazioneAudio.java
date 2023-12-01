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
        volume++;

    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
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
