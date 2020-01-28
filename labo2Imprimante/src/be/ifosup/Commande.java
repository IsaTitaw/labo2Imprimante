package be.ifosup;

public class Commande {
    private Boolean on;
    private Boolean off;



    /*Constructeur------------------------------------------------------------------------------------------------------------------------------*/

    public Commande(Boolean on, Boolean off) {
        this.on = on;
        this.off = off;

    }
//
//    /*Getset--------------------------------------------------------------------------------------------------------------------------------------*/
//
//    public Boolean getOn() {
//        return on;
//    }
//
//    public Boolean getOff() {
//        return off;
//    }



    /*Méthodes------------------------------------------------------------------------------------------------------------------------------------*/
    public void pousserOn() {
        System.out.println("L'imprimante est allumée");

    }

    public void pousserOff() {
        System.out.println("L'imprimante est éteinte");
    }



}