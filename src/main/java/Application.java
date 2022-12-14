import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

        public static void main(String[] args) {

            ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

//            this was hard-coded before
//            SpeakerService service = new SpeakerServiceImpl();

            SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
            System.out.println(service);
            System.out.println(service.findAll().get(0).getFirstName());

            SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
            System.out.println(service2);
            System.out.println(service2.findAll().get(0).getFirstName());
        }
}
