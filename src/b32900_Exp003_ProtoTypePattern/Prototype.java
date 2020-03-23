package b32900_Exp003_ProtoTypePattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Prototype implements Cloneable, Serializable {  
	  
    private static final long serialVersionUID = 1L;  
    private String string;  
  
    private SerializableObject obj;  
  
    /* shallow copy */  
    public Object clone() throws CloneNotSupportedException {  
        Prototype proto = (Prototype) super.clone();  
        return proto;  
    }  
  
    /* deep clone*/  
    public Object deepClone() throws IOException, ClassNotFoundException {  
  
        /* write current object stream */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* read current object stream*/  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return ois.readObject();  
    }  
  
    public String getString() {  
        return string;  
    }  
  
    public void setString(String string) {  
        this.string = string;  
    }  
  
    public SerializableObject getObj() {  
        return obj;  
    }  
  
    public void setObj(SerializableObject obj) {  
        this.obj = obj;  
    }  
  
    //BL: the following added myself
    public static void main(String[] args) throws ClassNotFoundException, IOException, CloneNotSupportedException {

    	//setup 
    	Prototype prototype = new Prototype(); 
    	  prototype.setString("#this is content string#");
    	  
    	SubSerializableObject  sbobject= new SubSerializableObject(" I am subobject string!!!");
    	  prototype.setObj(sbobject);
    	  
    	//do clone and deep clone
    	Prototype clonedPrototype=(Prototype)(prototype.clone());
    	Prototype deepclonedPrototype=(Prototype)(prototype.deepClone());

    	//check the difference between clone and deepclone
    	System.out.println("Original object--------:\r\n"+prototype);
    	System.out.println("\r\nCloned object--------:\r\n"+clonedPrototype);  //2 classes are the same;
    	System.out.println("\r\nCheck if prototype==clonedPrototype:"+(prototype==clonedPrototype)); 
    	System.out.println("Check if prototype member object==clonedPrototype member object:"
    	          +(prototype.getObj()==clonedPrototype.getObj())); //the cloned object's member object still the same
    	
    	
    	System.out.println("\r\nDeep cloned object--------:\r\n"+deepclonedPrototype);
       	System.out.println("\r\nCheck if prototype==deepClonedPrototype:"+(prototype==deepclonedPrototype)); 
    	System.out.println("Check if prototype member object==clonedPrototype member object:"
  	          +(prototype.getObj()==deepclonedPrototype.getObj()));  //deep cloned object's member object is different 
    }
    
    //BL: the following added myself
    public  String toString() {
    	return ("Object content: "+getString()+" \r\nInner object: "+obj); 
    	
    }
    
}  
  
class SerializableObject implements Serializable {  
    private static final long serialVersionUID = 1L;  
}  

//BL:
class SubSerializableObject extends SerializableObject{
	String content;
	AnotherClass ac; 
	
	SubSerializableObject(String input){
		content=input; 
		ac=new AnotherClass(String.valueOf(Math.random())); 
	}
	public String toString() {

		return " #Super Object:"+super.toString()+" \r\n#inner  object within inner object: "+ac;

	}
}

class AnotherClass implements Serializable{
	String str;
	public AnotherClass(String input) {
		str="Content of another class"+input;
	}
	public String getStr() {
		return str; 
	}
}
