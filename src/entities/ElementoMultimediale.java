package entities;

public abstract class ElementoMultimediale {
    //Attributi
    public String titolo;

    //Costruttore
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    //Metodo Abstract
    public abstract void esegui();
}
