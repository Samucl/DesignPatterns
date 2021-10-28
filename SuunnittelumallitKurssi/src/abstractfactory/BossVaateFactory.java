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
public class BossVaateFactory implements VaateFactory {

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
