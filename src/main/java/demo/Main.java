package demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load the Spring XML configuration file
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //for java config
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);

        // Retrieve the bean from the context
        // Nurse doctor = (Nurse) context.getBean("nurse");
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
        System.out.println(doctor);

        Doctor doctor1=context.getBean(Doctor.class);
        doctor1.setQualification("BDS");
        doctor1.assist();
        System.out.println(doctor1);
//        System.out.println(staff.getQualification());
        // Use the bean
        // ...
    }
}
