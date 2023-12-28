package demo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackages="demo")
public class BeanConfig {
//    @Bean
//    public Doctor doctor(){
//        return new Doctor();
//    }
//    @Bean
//    public Nurse nurse(){
//        return new Nurse();
//    }
}
