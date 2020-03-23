package practice200322.flyweight;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Button button= (Button)e.getSource();
        Component[] comps = button.getParent().getComponents();
        int count=-1;
        for (Component comp : comps) {
            count++;
            if(comp==button){
                System.out.println("x:"+count/10+" y:"+count%10);
            }

        }
                //list all children and iterate through, if button equals to child, print the num with num/10 and num%10
    }
}
