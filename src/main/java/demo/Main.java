package demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Retrieve the bean from the context
        // Nurse doctor = (Nurse) context.getBean("nurse");
        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
        System.out.println(staff.getQualification());
        // Use the bean
        // ...
    }
}
