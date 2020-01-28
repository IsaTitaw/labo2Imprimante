package be.ifosup;

public class Imprimante {
    private Toner leToner;
    private Impression l_impression;
    private BacPapier leBac;
    private Commande laCommande;

    /*Constructeur-------------------------------------------------------------------------------------------------------------------*/

    public Imprimante(Toner leToner, Impression l_impression, BacPapier leBac, Commande laCommande) {
        this.leToner = leToner;
        this.l_impression = l_impression;
        this.leBac = leBac;
        this.laCommande = laCommande;
    }

    /*Getset-----------------------------------------------------------------------------------------------------------------------------*/


    private Toner getLeToner() {
        return leToner;
    }

    private Impression getL_impression() {
        return l_impression;
    }

    private BacPapier getLeBac() {
        return leBac;
    }

    private Commande getLaCommande() {
        return laCommande;
    }

    /*Méthodes-------------------------------------------------------------------------------------------------------------------------*/

    public void imprimer(int nbPages, boolean type) {
        if (type) {
            int nbDepart = leBac.getNbFeuilles();
            int nbRestant = nbDepart - nbPages;
            leBac.setNbFeuilles(nbRestant);


        } else {
            int nbDepart = leBac.getNbFeuilles();
            int nbRestant = nbDepart - (nbPages/2);
            leBac.setNbFeuilles(nbRestant);

        }
        System.out.println("Impression en cours de " + nbPages + " page(s).");
        System.out.println("Nombre de feuilles restant: " + leBac.getNbFeuilles());


    }
}