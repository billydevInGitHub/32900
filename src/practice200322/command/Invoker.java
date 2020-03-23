package practice200322.command;

public class Invoker {
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }

}
