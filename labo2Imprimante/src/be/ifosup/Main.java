package be.ifosup;

public class Main {
    public static void main(String[] args) {
        Toner leToner = new Toner(100);
        BacPapier leBac = new BacPapier(100);
        Impression l_impression = new Impression(false);
        Commande laCommande = new Commande(true, false, false);

        Imprimante imprimante = new Imprimante(leToner, l_impression, leBac, laCommande);

        System.out.println(leToner);
        System.out.println(leBac);

        imprimante.imprimer(10, true);


    }
}
