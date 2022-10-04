import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//configure our app to run on spring framework.
//@ComponentScan({"com.pluralsight"}) is where we want to strt scanning for Beans to autowire
@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {
//    since Beans are singletons, even if getSpeakerService gets called multiple times, only one instance will be created\
//    BeanDefinition.SCOPE_PROTOTYPE creates a different instance each time its called

/*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
   public SpeakerService getSpeakerService(){
//        this is using the constructor  injection
//       SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        SpeakerServiceImpl service = new SpeakerServiceImpl();
//       service.setRepository(getSpeakerRepository());
       return service;
   }
*/
   @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
   }




}
