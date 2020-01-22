package b32900_Exp006_InterfaceAdapter;


interface Sourcable {
	
    public void method1();      
    public void method2();  
}  


abstract class Wrapper implements Sourcable {  
	  
 
    public  void method1() {};    
    public void method2() {};  
}  


class SubSource1 extends Wrapper{

	public void method1() {
		System.out.println("this is the first method!");
	}
}

class SubSource2 extends Wrapper {  
	  
    @Override  
    public void method2() {  
        System.out.println("this is the seconod method!");  
    }  
}  

public class AdapterTest {

    public static void main(String[] args) {  
        Sourcable source1 = new SubSource1();  
        Sourcable source2 = new SubSource2(); 
        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2(); 
    }

}
