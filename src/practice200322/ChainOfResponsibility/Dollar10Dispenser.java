package practice200322.ChainOfResponsibility;

public class Dollar10Dispenser implements  Dispenser {
    Dispenser nextDisp;
    @Override
    public void nextDispenser(Dispenser disp) {
        nextDisp=disp;
    }

    @Override
    public void dispense(int amount) {

        if(amount>=10) {
            int dispNum = amount / 10;
            int remainder = amount % 10;
            System.out.println("Dispensing 10 dollar: " + dispNum);
            if (remainder > 0) {
                throw new RuntimeException("input amount must be divided by 10");
            }
        }else{
            throw new RuntimeException("input amount must be divided by 10");
        }
    }
}
