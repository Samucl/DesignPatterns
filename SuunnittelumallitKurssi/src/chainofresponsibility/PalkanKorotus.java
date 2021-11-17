package chainofresponsibility;

public class PalkanKorotus {
    private PalkanKorotus seuraaja;
    
    public void setSeuraaja(PalkanKorotus seuraaja){
        this.seuraaja = seuraaja;
    }
    
    public void processPyynto(PalkkaPyynto pyynto){
        if(pyynto != null)
            seuraaja.processPyynto(pyynto);
    }
}
