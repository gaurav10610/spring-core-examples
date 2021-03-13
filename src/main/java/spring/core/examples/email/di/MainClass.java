package spring.core.examples.email.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

  public static void main(String[] args) {

    String message = "This is my first message";
    String receiverContact = "gaurav10610@gmail.com";

    MyApp app = null;
    MessageServiceInjector injector = null;
    System.out.println("Manual Email injector: ");

    // Send email
    injector = new EmailServiceInjector();
    app = injector.getAppInstance();
    app.processMessage(message, receiverContact);
    System.out.println();

    System.out.println("Manual Sms injector: ");
    // Send sms
    injector = new SmsServiceInjector();
    app = injector.getAppInstance();
    app.processMessage(message, receiverContact);
    System.out.println();
    System.out.println("Annotation based configuration: ");
    
    // Annotation based autowiring
    AnnotationConfigApplicationContext annotationContext =
        new AnnotationConfigApplicationContext(MyDIConfig.class);
    app = annotationContext.getBean(MyApp.class);
    app.processMessage(message, receiverContact);
    System.out.println();
    annotationContext.close();
    System.out.println("Xml based configuration: ");
    
    // XML based autowiring
    ClassPathXmlApplicationContext xmlContext =
        new ClassPathXmlApplicationContext("data\\email\\di\\BeanConfiguration.xml");
    app = (MyApp) xmlContext.getBean("MySmsApp");
    app.processMessage(message, receiverContact);
    System.out.println();

    app = (MyApp) xmlContext.getBean("MyEmailApp");
    app.processMessage(message, receiverContact);
    System.out.println();
    xmlContext.close();
  }

}
