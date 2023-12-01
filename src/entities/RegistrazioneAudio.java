package entities;

import interfaces.Riproducibile;

public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    public RegistrazioneAudio(String titolo) {
        super(titolo);
    }

    @Override
    public void play() {

    }
}
