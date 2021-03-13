package spring.core.examples.email.di;

import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements MessageService {

  @Override
  public void sendMessage(String message, String email) {
    System.out.println("Email message: " + message + " to: " + email);
  }

}
