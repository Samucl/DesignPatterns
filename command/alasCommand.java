package command;

public class alasCommand implements Command {
    Valkokangas valkokangas;
    
    public alasCommand(Valkokangas valkokangas){
        this.valkokangas = valkokangas;
    }
    
    @Override
    public void execute() {
        valkokangas.alas();
    }
}
