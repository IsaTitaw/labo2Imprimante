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

    public void setNbFeuilles(int nbFeuilles) {
        this.nbFeuilles = nbFeuilles;
    }
}
