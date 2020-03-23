package practice200322.command;

public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(new MyCommand(receiver));
        invoker.action();
    }
}
