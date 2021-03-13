package spring.core.examples.email.di;

public class EmailServiceInjector implements MessageServiceInjector {

  @Override
  public MyApp getAppInstance() {
    return new MyApp(new EmailServiceImpl());
  }
}
