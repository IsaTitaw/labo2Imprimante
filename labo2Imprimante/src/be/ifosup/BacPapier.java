package be.ifosup;

public class BacPapier {
    private int nbFeuilles;

    /*Constructeur----------------------------------------------------------------------------------------------------------------------------------*/

    public BacPapier(int nbFeuilles) {
        this.nbFeuilles = nbFeuilles;
    }

    @Override
    public String toString() {
        return "BacPapier{" +
                "nbFeuilles=" + nbFeuilles +
                '}';
    }

    /*Getset---------------------------------------------------------------------------------------------------------------------------------------------------*/

    public int getNbFeuilles() {
        return nbFeuilles;
    }

    protected void setNbFeuilles(int nbFeuilles) {
        this.nbFeuilles = nbFeuilles;
    }

    /*Méthodes-------------------------------------------------------------------------------------------------------------------------------------------------------*/
    public void chargerpapier(int nbFeuillesChar){
        System.out.println("Charger "+ nbFeuillesChar+" feuilles");

    }
}
