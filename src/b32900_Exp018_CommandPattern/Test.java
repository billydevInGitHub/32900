package b32900_Exp018_CommandPattern;

interface Command {  
    public void exe();  
}  


//BL: the advantage of Command is let you know there are several commands in this system !! 
class MyCommand implements Command {  
	  
    private Receiver receiver;  
      
    public MyCommand(Receiver receiver) {  
        this.receiver = receiver;  
    }  
  
    @Override  
    public void exe() {  
        receiver.action();  
    }  
}  

class Receiver {  
    public void action(){  
        System.out.println("command received!");  
    }  
}  

class Invoker {  
    //this is the command holder, or command existing in Invoker
    private Command command;  //I guess invoker can have several implementations, but the call method 
                              //and call pattern is the same , invoker could have a collection of command 
                              //then use a parameter to choose one of them 
      
    public Invoker(Command command) {  
        this.command = command;  
    }  
  
    public void action(){  
        command.exe();  
    }  
}  

public class Test {
	public static void main(String[] args) {  
        Receiver receiver = new Receiver();  
        Command cmd = new MyCommand(receiver);  //receiver is wrapped by Command
        Invoker invoker = new Invoker(cmd);  //Invoker is the holder of command and only interface to Command
        invoker.action();  
    }
}
