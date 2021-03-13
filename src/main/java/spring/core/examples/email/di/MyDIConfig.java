package spring.core.examples.email.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("gaurav.email.di")
public class MyDIConfig {

  @Bean
  public MessageService getMessageService() {
    return new EmailServiceImpl();
    // return new SmsServiceImpl();
  }

  @Bean
  public MyApp getEmailApp() {
    return new MyApp(new EmailServiceImpl());
  }
}
