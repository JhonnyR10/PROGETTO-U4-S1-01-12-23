package entities;

import interfaces.RegolaLuminosita;

public class Immagine extends ElementoMultimediale implements RegolaLuminosita {
    public Immagine(String titolo) {
        super(titolo);
    }

    @Override
    public void aumentaLuminosita() {

    }

    @Override
    public void diminuisciLuminosita() {

    }
}
