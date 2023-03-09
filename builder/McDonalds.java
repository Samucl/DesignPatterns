package builder;

public class McDonalds {
    
    public McDonaldsHampurilainen tilaaBigMac(){
        McDonaldsHampurilainen bigMac = new McDonaldsHampurilainen();
        bigMac.getBigMac();
        return bigMac;
    }
    
    public McDonaldsHampurilainen tilaaMcFeast(){
        McDonaldsHampurilainen mcFeast = new McDonaldsHampurilainen();
        mcFeast.getMcFeast();
        return mcFeast;
    }
}
