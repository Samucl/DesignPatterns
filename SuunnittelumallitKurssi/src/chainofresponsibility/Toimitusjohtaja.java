package chainofresponsibility;

public class Toimitusjohtaja extends PalkanKorotus{
    private final double maxKorotus = 5;
    
    public void processPyynto(PalkkaPyynto pyynto){
        if(pyynto.getKorotus() >= maxKorotus){
            System.out.println("Toimitusjohtaja hyväksyy " + pyynto.getKorotus() + "% palkankorotuksen");
        } else {
            super.processPyynto(pyynto);
        }
    }
}