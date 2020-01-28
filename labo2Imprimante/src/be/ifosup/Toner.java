package be.ifosup;

public class Toner {
    private int niveauEncre= 100;

    /*Constructeur--------------------------------------------------------------------------------------------------------------------------------------------------*/

    public Toner(int niveauEncre) {
        this.niveauEncre = niveauEncre;
    }

    @Override
    public String toString() {
        return "Toner{" +
                "niveauEncre=" + niveauEncre +
                '}';
    }

    /*Getset-----------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    public int getNiveauEncre() {
        return niveauEncre;
    }
}
