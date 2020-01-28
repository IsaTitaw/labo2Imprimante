package be.ifosup;

public class Toner {
    private int niveauEncre;

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

    public void setNiveauEncre(int niveauEncre) {
        this.niveauEncre = niveauEncre;
    }

    /*-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    public void remplacerToner(){
        System.out.println("Nouveau toner installé");
    }
}
