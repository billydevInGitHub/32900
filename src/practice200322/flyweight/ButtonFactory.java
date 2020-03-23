package practice200322.flyweight;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class ButtonFactory {
    private static Map<String, Button> cache= new HashMap<>();
    private static int shared=0;
    private static ActionListener buttonListener= new ButtonListener();

    public static Button makeButton(String num){
        Button button=null;
        if(cache.get(num)!=null){
            shared++;
            button = new Button(cache.get(num).getLabel());
        }else{
            //put into cache
            button = new Button(num);
            cache.put(num, button);
        }
        button.addActionListener(buttonListener);
        return button;
    }

    public static void report(){
        System.out.println("There are "+shared  +" shared buttons");
        System.out.println("Cahced buttons:"+cache);
    }
}
