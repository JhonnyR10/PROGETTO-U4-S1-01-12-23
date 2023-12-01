package entities;

import interfaces.RegolaVolume;
import interfaces.Riproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile, RegolaVolume {
    public RegistrazioneAudio(String titolo) {
        super(titolo);
    }

    @Override
    public void play() {

    }

    @Override
    public void aumentaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }
}
