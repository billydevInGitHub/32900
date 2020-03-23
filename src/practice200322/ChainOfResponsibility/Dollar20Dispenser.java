package practice200322.ChainOfResponsibility;

public class Dollar20Dispenser implements  Dispenser {
    Dispenser nextDisp;

    @Override
    public void nextDispenser(Dispenser disp) {
        nextDisp=disp;
    }

    @Override
    public void dispense(int amount) {
        if(amount>=20){
            int dispNum=amount/20;
            int remainder=amount%20;
            System.out.println("Dispensing 20 dollar: "+dispNum);
            if(remainder>0){
                nextDisp.dispense(remainder);
            }
        }else{
            nextDisp.dispense(amount);
        }
    }
}
