package Day13;

public class NotificationService
{
 public void sendNotification(String _type)
{
  
	 System.out.println("NotificationService.sendNotification()");
	 
	 if (_type.equalsIgnoreCase("sms"))
	 {
		 sendSMS();
	 }
	 else if (_type.equalsIgnoreCase("sms"))
	 {
		 sendEmail();
	 }else
	 {
		 sendWhatsApp();
	 } 
}
  private void sendSMS() {
	 
	 System.out.println("NotficationService() START");
	 // BIZ logic
	 System.out.println("NotificationService() END ");
 }
  
  private void sendEmail() {
		 
		 System.out.println("NotficationService() START");
		 // BIZ logic
		 System.out.println("NotificationService() END ");
	 }
  
  private void sendWhatsApp() {
		 
		 System.out.println("NotficationService() START");
		 // BIZ logic
		 System.out.println("NotificationService() END ");
	 }
 
}

