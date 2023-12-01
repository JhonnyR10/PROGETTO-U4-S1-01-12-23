import entities.ElementoMultimediale;
import entities.Immagine;
import entities.RegistrazioneAudio;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];

        int indice = 0;
        while (indice < elementiMultimediali.length) {
            System.out.println("Inserisci un elemento Multimediale. Premi 'I' per inserire un immagine, premi 'R per inserire una registrazione audio, premi 'V per inserire un video: ");
            String elementoScelto = input.nextLine();
            String titolo;
            int durata;
            int luminosita;
            int volume;
            switch (elementoScelto) {
                case "I":
                    System.out.println("Inserisci il titolo dell'immagine: ");
                    titolo = input.nextLine();
                    System.out.println("Inserisci la luminosità dell'immagine: ");
                    luminosita = Integer.parseInt(input.nextLine());
                    if (luminosita < 0 || luminosita > 100) {
                        do {
                            System.out.println("Valore non valido per la luminosità, prego inserirla nuovamente:");
                            luminosita = Integer.parseInt(input.nextLine());
                        } while (luminosita < 0 || luminosita > 100);

                    }
                    Immagine immagine = new Immagine(titolo, luminosita);
                    elementiMultimediali[indice] = immagine;
                    indice++;
                    break;
                case "R":
                    System.out.println("Inserisci il titolo della registrazione audio: ");
                    titolo = input.nextLine();
                    System.out.println("Inserisci la durata della registrazione audio: ");
                    durata = Integer.parseInt(input.nextLine());
                    System.out.println("Inserisci il volume della registrazione audio: ");
                    volume = Integer.parseInt(input.nextLine());
                    if (volume < 0 || volume > 10) {
                        do {
                            System.out.println("Valore non valido per il volume, prego inserirlo nuovamente:");
                            volume = Integer.parseInt(input.nextLine());
                        } while (volume < 0 || volume > 10);

                    }
                    RegistrazioneAudio registrazione = new RegistrazioneAudio(titolo, durata, volume);
                    elementiMultimediali[indice] = registrazione;
                    indice++;
                    break;
                case "V":
                    System.out.println("Inserisci il titolo del video: ");
                    titolo = input.nextLine();
                    System.out.println("Inserisci la durata del video: ");
                    durata = Integer.parseInt(input.nextLine());
                    System.out.println("Inserisci il volume del video: ");
                    volume = Integer.parseInt(input.nextLine());
                    if (volume < 0 || volume > 10) {
                        do {
                            System.out.println("Valore non valido per il volume, prego inserirlo nuovamente:");
                            volume = Integer.parseInt(input.nextLine());
                        } while (volume < 0 || volume > 10);

                    }
                    System.out.println("Inserisci la luminosità del video: ");
                    luminosita = Integer.parseInt(input.nextLine());
                    if (luminosita < 0 || luminosita > 100) {
                        do {
                            System.out.println("Valore non valido per la luminosità, prego inserirla nuovamente:");
                            luminosita = Integer.parseInt(input.nextLine());
                        } while (luminosita < 0 || luminosita > 100);

                    }
                    Video video = new Video(titolo, durata, volume, luminosita);
                    elementiMultimediali[indice] = video;
                    indice++;
            }
        }


        int scelta;
        do {
            System.out.println("Scegli quale oggetto eseguire (1-5, 0 per uscire): ");
            scelta = Integer.parseInt(input.nextLine());

            if (scelta >= 1 && scelta <= 5) {
                if (elementiMultimediali[scelta - 1] instanceof Immagine)
                    ((Immagine) elementiMultimediali[scelta - 1]).esegui();
                else if (elementiMultimediali[scelta - 1] instanceof RegistrazioneAudio) {
                    ((RegistrazioneAudio) elementiMultimediali[scelta - 1]).esegui();
                } else {
                    ((Video) elementiMultimediali[scelta - 1]).esegui();
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);
    }
}
