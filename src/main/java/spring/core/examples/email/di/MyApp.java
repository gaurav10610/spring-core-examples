package spring.core.examples.email.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyApp {

  private MessageService messageService = null;

  @Autowired
  public MyApp(MessageService messageService) {
    this.messageService = messageService;
  }

  public void processMessage(String message, String email) {
    this.messageService.sendMessage(message, email);
  }
}
