package practice200322.flyweight;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class FlyweightTest {
    public static void main(String[] args) {
        Random r = new Random();
        Frame frame = new Frame();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setLayout(new GridLayout(10,10));
        int k=10;
        for (int i = 0; i < k; i++) {
            for (int j = 0;  j< k; j++) {
                frame.add(ButtonFactory.makeButton(String.valueOf(r.nextInt(15))));
            }
        }
        frame.pack();
        frame.setVisible(true);
        ButtonFactory.report();
    }
}
