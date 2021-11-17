package chainofresponsibility;

public class Lahiesimies extends PalkanKorotus{
    private final double maxKorotus = 2;
    
    public void processPyynto(PalkkaPyynto pyynto){
        if(pyynto.getKorotus() <= maxKorotus){
            System.out.println("Lähiesimies hyväksyy " + pyynto.getKorotus() + "% palkankorotuksen");
        } else {
            super.processPyynto(pyynto);
        }
    }
}
