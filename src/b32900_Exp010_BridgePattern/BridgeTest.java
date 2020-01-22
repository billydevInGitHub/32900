package b32900_Exp010_BridgePattern;

interface Sourceable {  
    public void method();  
}  

class SourceSub1 implements Sourceable {  
	  
    @Override  
    public void method() {  
        System.out.println("this is the first sub!");  
    }  
}  

class SourceSub2 implements Sourceable {  
	  
    @Override  
    public void method() {  
        System.out.println("this is the second sub!");  
    }  
}  

abstract class Bridge {  
    private Sourceable source;  
  
    public void method(){  
        source.method();  
    }  
      
    public Sourceable getSource() {  
        return source;  
    }  
  
    public void setSource(Sourceable source) {  
        this.source = source;  
    }  
}  

class MyBridge extends Bridge {  
    public void method(){  
        getSource().method();  
    }  
}  

public class BridgeTest {

	public static void main(String[] args) {  
        
        Bridge bridge = new MyBridge();  
          
        /*create first object*/  
        Sourceable source1 = new SourceSub1();  
        bridge.setSource(source1);  
        bridge.method();  
          
        /*create second object*/  
        Sourceable source2 = new SourceSub2();  
        bridge.setSource(source2);  
        bridge.method();  
    }  
}
