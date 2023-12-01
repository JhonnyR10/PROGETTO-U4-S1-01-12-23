package entities;

import interfaces.Riproducibile;

public class Video extends ElementoMultimediale implements Riproducibile {

    public Video(String titolo) {
        super(titolo);
    }

    @Override
    public void play() {

    }
}
