package be.ifosup;

public class Commande {
    private Boolean on;
    private Boolean off;
    private Boolean chargerPapier;


    /*Constructeur------------------------------------------------------------------------------------------------------------------------------*/

    public Commande(Boolean on, Boolean off, Boolean chargerPapier) {
        this.on = on;
        this.off = off;
        this.chargerPapier = chargerPapier;
    }

    /*Getset--------------------------------------------------------------------------------------------------------------------------------------*/

    public Boolean getOn() {
        return on;
    }

    public Boolean getOff() {
        return off;
    }

    public Boolean getChargerPapier() {
        return chargerPapier;
    }



    /*Méthodes------------------------------------------------------------------------------------------------------------------------------------*/
    public void pouserOn() {

    }

    public void pousserOff() {

    }

    public void pousserChargerPapier() {

    }

}