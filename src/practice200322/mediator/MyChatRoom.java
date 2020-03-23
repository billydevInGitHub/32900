package practice200322.mediator;

import java.util.HashMap;
import java.util.Map;

public class MyChatRoom implements IChatRoom {

    Map<String, User> userMap = new HashMap<>();



    @Override
    public void addUser(User user) {
        userMap.put(user.getUserId(), user);
    }

    @Override
    public void sendMsg(String msg, User receiver) {
        userMap.get(receiver.getUserId()).receiveMsg();
    }
}
