package entities;

import interfaces.RegolaLuminosita;


public class Video extends RegistrazioneAudio implements RegolaLuminosita {
    //Attributi
    private int luminosita;

    //Costruttore
    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
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
        play();
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + ": " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

}
