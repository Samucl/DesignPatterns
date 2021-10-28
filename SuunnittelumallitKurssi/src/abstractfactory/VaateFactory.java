/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Samuel
 */
public interface VaateFactory {
    public abstract Farmarit createFarmarit();
    public abstract Tpaita createTpaita();
    public abstract Lippis createLippis();
    public abstract Kengat createKengat();
}
