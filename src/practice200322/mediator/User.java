package practice200322.mediator;

public abstract class User {

    private String userId;

    private IChatRoom mediator;

    public User(String userId, IChatRoom mediator) {
        this.userId = userId;
        this.mediator = mediator;
    }

    public abstract void sendMsg(String msg, User receiver);

    public abstract void receiveMsg();

    public String getUserId(){
        return userId;
    }

    public IChatRoom getMediator(){
        return mediator;
    }

}
