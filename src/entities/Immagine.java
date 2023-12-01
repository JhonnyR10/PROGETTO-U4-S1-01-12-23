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
        if (luminosita < 100) {
            luminosita++;
            System.out.println("Luminosità aumentato a: " + luminosita);
        } else {
            System.out.println("Luminosità già al massimo");
        }
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
            System.out.println("Luminosità diminuito a: " + luminosita);
        } else {
            System.out.println("Luminosità già al minimo!");
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
