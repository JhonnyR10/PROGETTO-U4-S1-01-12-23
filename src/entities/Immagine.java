package entities;

import interfaces.RegolaLuminosita;

public class Immagine extends ElementoMultimediale implements RegolaLuminosita {

    //Attributi
    private int luminosita;

    //Costruttore
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    //Metodi
    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

    @Override
    public void esegui() {
        show();
    }

    public void show() {
        System.out.println(this.titolo + " " + "*".repeat(luminosita));
    }


}
