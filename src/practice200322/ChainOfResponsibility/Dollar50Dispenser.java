package practice200322.ChainOfResponsibility;

public class Dollar50Dispenser implements Dispenser {
    Dispenser nextDis;
    @Override
    public void nextDispenser(Dispenser disp) {
        nextDis=disp;
    }

    @Override
    public void dispense(int amount) {
        if(amount>=50){
            int dispNum=amount/50;
            int remainder=amount%50;
            System.out.println("Dispensing 50 dollar:"+dispNum);
            if(remainder>0){
                nextDis.dispense(remainder);
            }
        }else{
            nextDis.dispense(amount);
        }
    }

}
