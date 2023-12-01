package entities;

import interfaces.RegolaLuminosita;
import interfaces.RegolaVolume;
import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile, RegolaLuminosita, RegolaVolume {

    public Video(String titolo) {
        super(titolo);
    }

    @Override
    public void play() {

    }

    @Override
    public void aumentaLuminosita() {

    }

    @Override
    public void diminuisciLuminosita() {

    }

    @Override
    public void aumentaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }
}
