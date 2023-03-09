package chainofresponsibility;

public class Paallikko extends PalkanKorotus{
    private final double maxKorotus = 5;
    
    public void processPyynto(PalkkaPyynto pyynto){
        if(pyynto.getKorotus() <= maxKorotus){
            System.out.println("Paallikko hyväksyy " + pyynto.getKorotus() + "% palkankorotuksen");
        } else {
            super.processPyynto(pyynto);
        }
    }
}
