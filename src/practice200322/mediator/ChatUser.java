package practice200322.mediator;

public class ChatUser extends User {

    public ChatUser(String userId, IChatRoom mediator) {
        super(userId, mediator);
    }

    @Override
    public void sendMsg(String msg, User receiver) {
        System.out.print(getUserId()+" is sending msg...");
        getMediator().sendMsg(msg,receiver);
    }

    @Override
    public void receiveMsg() {
        System.out.println(getUserId()+" received message!");
    }
}
