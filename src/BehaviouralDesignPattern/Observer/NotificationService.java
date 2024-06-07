package BehaviouralDesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private List<EmailNotifyUsers> users;

    NotificationService(){
        users = new ArrayList<>();
    }

    public void addUserInEmailList(EmailNotifyUsers user){
        users.add(user);
    }

    public void removeUserFromEmailList(EmailNotifyUsers user){
        users.remove(user);
    }

    public void notifyUsers(){
        users.forEach(user -> user.sendEmail());
    }

}
