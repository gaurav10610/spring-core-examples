package spring.core.examples.email.di;

public class SmsServiceInjector implements MessageServiceInjector {

  @Override
  public MyApp getAppInstance() {
    return new MyApp(new SmsServiceImpl());
  }
}
