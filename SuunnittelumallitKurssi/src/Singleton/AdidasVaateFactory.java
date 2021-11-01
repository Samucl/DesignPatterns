package Singleton;

public class AdidasVaateFactory implements VaateFactory {

    private AdidasVaateFactory(){}
    
    private static AdidasVaateFactory INSTANCE = null;
    
    public static AdidasVaateFactory getInstance(){
        if (INSTANCE == null){
        INSTANCE = new AdidasVaateFactory();
        }
        return INSTANCE;
    }
    
    @Override
    public Farmarit createFarmarit() {
        return new AdidasFarmarit();
    }

    @Override
    public Tpaita createTpaita() {
        return new AdidasTpaita();
    }

    @Override
    public Lippis createLippis() {
        return new AdidasLippis();
    }

    @Override
    public Kengat createKengat() {
        return new AdidasKengat();
    }


    
}
