package singleton;

import abstractfactory.*;

public interface VaateFactory {
    public abstract Farmarit createFarmarit();
    public abstract Tpaita createTpaita();
    public abstract Lippis createLippis();
    public abstract Kengat createKengat();
}
