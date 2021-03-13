package spring.core.examples.email.di;

public class SmsServiceImpl implements MessageService {

  @Override
  public void sendMessage(String message, String email) {
    System.out.println("SMS message: " + message + " to: " + email);
  }

}
