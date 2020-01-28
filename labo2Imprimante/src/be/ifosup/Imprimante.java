package be.ifosup;

public class Imprimante {
    private Toner leToner;
    private BacPapier leBac;
    private Commande laCommande;


    /*Constructeur-------------------------------------------------------------------------------------------------------------------*/

    public Imprimante(Toner leToner, BacPapier leBac, Commande laCommande) {
        this.leToner = leToner;
        this.leBac = leBac;
        this.laCommande = laCommande;
    }

    /*Getset-----------------------------------------------------------------------------------------------------------------------------*/


    private Toner getLeToner() {
        return leToner;
    }


    private BacPapier getLeBac() {
        return leBac;
    }



    /*Méthodes-------------------------------------------------------------------------------------------------------------------------*/

    public void allumerImprimante() {
        laCommande.pousserOn();
    }

    public void imprimer(int nbPages, String type) {
        int niveauDepart = leToner.getNiveauEncre();
        int niveauRestant = niveauDepart - nbPages;
        leToner.setNiveauEncre(niveauRestant);

        if (type != "RV") {
            int nbDepart = leBac.getNbFeuilles();
            int nbRestant = nbDepart - nbPages;
            leBac.setNbFeuilles(nbRestant);


        } else {
            int nbDepart = leBac.getNbFeuilles();
            int nbRestant = nbDepart - (nbPages / 2);
            leBac.setNbFeuilles(nbRestant);

        }

        if (leBac.getNbFeuilles() >= nbPages && leToner.getNiveauEncre() >= nbPages) {
            System.out.println("Impression en cours de " + nbPages + " page(s) en " + type);
            System.out.println("Nombre de feuilles restant: " + leBac.getNbFeuilles());
        }else{

            System.out.println("impression annulée");
                    if (leBac.getNbFeuilles() <= 0) {
                        leBac.chargerpapier(100);   //on repart avec un nouveau bac à papier et on relance le main
                        } else if (leToner.getNiveauEncre() <= 0) {
                            leToner.remplacerToner();      //on repart avec un nouveau toner et on relance le main





                      }

        }
    }
}