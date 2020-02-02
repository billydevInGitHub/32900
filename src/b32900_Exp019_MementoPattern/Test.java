package b32900_Exp019_MementoPattern;


class Original {  
    
    private String value;  
      
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }  
  
    public Original(String value) {  
        this.value = value;  
    }  
  
    public Memento createMemento(){  
        return new Memento(value);  
    }  
      
    public void restoreMemento(Memento memento){  
        this.value = memento.getValue();  
    }  
}  

class Memento {  
    
    private String value;  
  
    public Memento(String value) {  
        this.value = value;  
    }  
  
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }  
}  

class Storage {  
    
    private Memento memento;  
      
    public Storage(Memento memento) {  
        this.memento = memento;  
    }  
  
    public Memento getMemento() {  
        return memento;  
    }  
  
    public void setMemento(Memento memento) {  
        this.memento = memento;  
    }  
}  


public class Test {

	
	public static void main(String[] args) {  
        
        //
        Original origi = new Original("egg");  
  
        //
        Storage storage = new Storage(origi.createMemento());  
  
        //
        System.out.println("" + origi.getValue());  
        origi.setValue("niu");  
        System.out.println("" + origi.getValue());  
  
        //
        origi.restoreMemento(storage.getMemento());  
        System.out.println("" + origi.getValue());  
    }  
}
