package BehaviouralDesignPattern.Observer;

public class OnlineStoreApp {

    private NotificationService notificationService;

    OnlineStoreApp(){
        this.notificationService = new NotificationService();
    }

    public void alertAboutNewProduct(){
        notificationService.notifyUsers();
    }
}
