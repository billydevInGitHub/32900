package practice200322.ChainOfResponsibility;

public interface Dispenser {
    void nextDispenser(Dispenser disp);
    void dispense(int amount);
}
