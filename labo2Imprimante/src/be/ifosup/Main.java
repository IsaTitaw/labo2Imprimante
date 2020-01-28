package be.ifosup;

public class Main {
    public static void main(String[] args) {
        Toner leToner = new Toner(50);
        BacPapier leBac = new BacPapier(100);
        Commande laCommande = new Commande(true, false);

        Imprimante imprimante = new Imprimante(leToner, leBac, laCommande);

        imprimante.allumerImprimante();
        System.out.println(leToner);
        System.out.println(leBac);

        imprimante.imprimer(10, "RV");
        imprimante.imprimer(10, "R");
        imprimante.imprimer(40, "R");

        System.out.println(leBac);
        System.out.println(leToner);


    }
}
