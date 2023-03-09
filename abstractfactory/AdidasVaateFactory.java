package abstractfactory;

public class AdidasVaateFactory implements VaateFactory {

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
