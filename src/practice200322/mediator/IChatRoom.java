package practice200322.mediator;

public interface IChatRoom {
    void addUser( User user);

    void sendMsg(String msg, User receiver);
}
