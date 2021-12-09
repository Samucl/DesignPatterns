package command;

public class ylosCommand implements Command {
    Valkokangas valkokangas;
    
    public ylosCommand(Valkokangas valkokangas){
        this.valkokangas = valkokangas;
    }
    
    @Override
    public void execute() {
        valkokangas.ylos();
    }
}
