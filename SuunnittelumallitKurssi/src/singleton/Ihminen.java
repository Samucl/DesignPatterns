package singleton;

import abstractfactory.*;

public class Ihminen {
    private String nimi;
    private Farmarit farmarit;
    private Kengat kengat;
    private Lippis lippis;
    private Tpaita tpaita;
    private boolean valmistunut = false;

    public boolean isValmistunut() {
        return valmistunut;
    }

    public void setValmistunut(boolean valmistunut) {
        this.valmistunut = valmistunut;
        System.out.println("\n" + this.getNimi() + " valmistuu...\n");
    }
    
    public Ihminen (String nimi){
        this.nimi = nimi;
    }

    public Farmarit getFarmarit() {
        return farmarit;
    }

    public void setFarmarit(Farmarit farmarit) {
        this.farmarit = farmarit;
    }

    public Kengat getKengat() {
        return kengat;
    }

    public void setKengat(Kengat kengat) {
        this.kengat = kengat;
    }

    public Lippis getLippis() {
        return lippis;
    }

    public void setLippis(Lippis lippis) {
        this.lippis = lippis;
    }

    public Tpaita getTpaita() {
        return tpaita;
    }

    public void setTpaita(Tpaita tpaita) {
        this.tpaita = tpaita;
    }
    
    public String getNimi(){
        return nimi;
    }
}
