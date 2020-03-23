package practice200322.ChainOfResponsibility;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestChainOfResponsibility {
    public static void main(String[] args) {
        Dispenser disp50= new Dollar50Dispenser();
        Dispenser disp20=new Dollar20Dispenser();
        Dispenser disp10 =new Dollar10Dispenser();
        disp50.nextDispenser(disp20);
        disp20.nextDispenser(disp10);

        while(true){
            Scanner  scanner = new Scanner(System.in);
            System.out.println("Please input the amount:");
            int amount = scanner.nextInt();
            if(amount%10!=0){
                System.out.println("Please input a number divided by 10");
                continue;
            }
            disp50.dispense(amount);
        }
    }
}
