package practice200322.facade;

public class TestFacade {
    public static void main(String[] args) {
        Computer computer = new Computer(new CPU(), new Disk(), new Memory());
        computer.startup();;
        computer.shutdown();

    }
}
