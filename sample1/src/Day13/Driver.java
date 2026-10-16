package Day13;

public class Driver {

	 public static void main(String[] args) {
		 NotificationService notificationService = new NotificationService();
		 
		 notificationService.sendNotification("sms");
		 notificationService.sendNotification("email");
		 notificationService.sendNotification("other");
	 }
}
