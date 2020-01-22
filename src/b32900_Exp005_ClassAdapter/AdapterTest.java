package b32900_Exp005_ClassAdapter;


class Source {  
	  
    public void method1() {  
        System.out.println("this is original method!");  
    }  
}  


interface Targetable {  
	  

    public void method1();  
  
    public void method2();  
}  


class Adapter extends Source implements Targetable {  
	  
    @Override  
    public void method2() {  
        System.out.println("this is the targetable method!");  
    }  
}  

public class AdapterTest {

    public static void main(String[] args) {  
        Targetable target = new Adapter();  
        target.method1();  
        target.method2();  
    }

}
