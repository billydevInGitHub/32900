package practice200322.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Prototype implements  Cloneable, Serializable{

    public Prototype() {
        this.intValue = 20;
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");
    }

    private List<String> list = new ArrayList<>();
    private int intValue;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao= new ByteArrayOutputStream();
        ObjectOutputStream oos= new ObjectOutputStream(bao);
        oos.writeObject(this);
        ByteArrayInputStream bai= new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream bis = new ObjectInputStream(bai);
        return bis.readObject();
    }


}
