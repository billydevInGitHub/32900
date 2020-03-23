package practice200322.command;

public class MyCommand implements Command {
    Receiver receiver ;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}
