package singleton;

import abstractfactory.*;

public class BossVaateFactory implements VaateFactory {

    private BossVaateFactory(){}
    
    private static BossVaateFactory INSTANCE = null;
    
    public static BossVaateFactory getInstance(){
        if (INSTANCE == null){
        INSTANCE = new BossVaateFactory();
        }
        return INSTANCE;
    }
    
    @Override
    public Farmarit createFarmarit() {
        return new BossFarmarit();
    }

    @Override
    public Tpaita createTpaita() {
        return new BossTpaita();
    }

    @Override
    public Lippis createLippis() {
        return new BossLippis();
    }

    @Override
    public Kengat createKengat() {
        return new BossKengat();
    }

    
}
