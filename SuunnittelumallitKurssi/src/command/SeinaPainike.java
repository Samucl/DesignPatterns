package command;

public class SeinaPainike {
    Command cmd;
    
    public SeinaPainike (Command cmd){
        this.cmd = cmd;
    }
    
    public void paina(){
        cmd.execute();;
    }
}
