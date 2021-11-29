package builder;

public class Hesburger {
    public HesburgerHampurilainen tilaaKerrosHampurilainen(){
        HesburgerHampurilainen kerrosHampurilainen = new HesburgerHampurilainen();
        kerrosHampurilainen.getKerrosHampurilainen();
        return kerrosHampurilainen;
    }
    public HesburgerHampurilainen tilaaJuustoHampurilainen(){
        HesburgerHampurilainen juustoHampurilainen = new HesburgerHampurilainen();
        juustoHampurilainen.getJuustoHampurilainen();
        return juustoHampurilainen;
    }
}
