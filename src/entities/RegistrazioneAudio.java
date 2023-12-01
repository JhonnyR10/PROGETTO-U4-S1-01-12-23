package entities;

import interfaces.RegolaVolume;
import interfaces.Riproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile, RegolaVolume {

    //Attributi
    private int durata;
    private int volume;

    //Costruttore
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void play() {

    }

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
}
