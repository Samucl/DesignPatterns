package Singleton;

import abstractfactory.*;

public class Main {
    
        private static VaateFactory factory;
    
        public static void main(String[] args) {
            Ihminen ihminen = new Ihminen("Jasper");
            puePaalle(ihminen);
            ihminen.setValmistunut(true);
            puePaalle(ihminen);
        }
        
        public static void puePaalle(Ihminen ihminen){
            if(ihminen.isValmistunut()){
                factory = BossVaateFactory.getInstance();
            }
            else
                factory = AdidasVaateFactory.getInstance();
            
            ihminen.setFarmarit(factory.createFarmarit());
            ihminen.setTpaita(factory.createTpaita());
            ihminen.setLippis(factory.createLippis());
            ihminen.setKengat(factory.createKengat());
            System.out.println(ihminen.getNimi() + " pukee vaatteet: \n - " + ihminen.getFarmarit() + "\n - " + ihminen.getTpaita() + "\n - " + ihminen.getLippis() + "\n - " + ihminen.getKengat());
        }
}
