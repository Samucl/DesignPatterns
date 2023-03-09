package builder;

public class HesburgerHampurilainen implements Hampurilainen{

    private StringBuilder hampurilainen = new StringBuilder();
    
    public void getKerrosHampurilainen(){
        hampurilainen.append(new Sampyla().getNimi() + "\n");
        hampurilainen.append(new Sipuli().getNimi() + "\n");
        hampurilainen.append(new Juusto().getNimi() + "\n");
        hampurilainen.append(new Pihvi().getNimi() + "\n");
        hampurilainen.append(new Sampyla().getNimi() + "\n");
        hampurilainen.append(new Majoneesi().getNimi() + "\n");
        hampurilainen.append(new Salaatti().getNimi() + "\n");
        hampurilainen.append(new Pihvi().getNimi() + "\n");
        hampurilainen.append(new Sampyla().getNimi());
    }
    
    public void getJuustoHampurilainen(){
        hampurilainen.append(new Sampyla().getNimi() + "\n");
        hampurilainen.append(new Majoneesi().getNimi() + "\n");
        hampurilainen.append(new Sipuli().getNimi() + "\n");
        hampurilainen.append(new Juusto().getNimi() + "\n");
        hampurilainen.append(new Pihvi().getNimi() + "\n");
        hampurilainen.append(new Sampyla().getNimi());
    }
    
    @Override
    public void naytaHampurilainen() {
        System.out.println(hampurilainen.toString());
    }
    
}
