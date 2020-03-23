package practice200322.mediator;

public class TestMediator {
    public static void main(String[] args) {
        IChatRoom iChatRoom= new MyChatRoom();

        ChatUser user1 = new ChatUser("user1", iChatRoom);
        iChatRoom.addUser(user1);
        ChatUser user2 = new ChatUser("user2", iChatRoom);
        iChatRoom.addUser(user2);
        ChatUser user3 = new ChatUser("user3", iChatRoom);
        iChatRoom.addUser(user3);
        user1.sendMsg("test111",user2);
        user2.sendMsg("testssss", user3);
    }

}
