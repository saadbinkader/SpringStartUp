/**
 * Created with IntelliJ IDEA.
 * User: sk.saad
 * Date: 7/29/13
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */
import net.therap.spring.Greeter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingManager {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Greeter greeter = (Greeter) context.getBean("greeter") ;
        greeter.greet();
    }
}
