package command;

public class Main {
    public static void main(String[] args){
        Valkokangas valkokangas = new Valkokangas();
        Command ylos = new ylosCommand(valkokangas);
        Command alas = new alasCommand(valkokangas);
        SeinaPainike ylosNappi = new SeinaPainike(ylos);
        SeinaPainike alasNappi = new SeinaPainike(alas);
        
        ylosNappi.paina();
        alasNappi.paina();
    }
}
