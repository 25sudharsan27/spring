package demo;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.BeanNameAware;

import javax.annotation.PostConstruct;

// singleton for same object for all
@Component

@Scope(scopeName="prototype")
public class Doctor implements Staff,BeanNameAware {
    @Override
    public String toString(){
        return "Doctor{"+"qualification='"+qualification+'\''+"}";
    }
    private String qualification;
//    private Nurse nurse;
//    public Doctor(String qualification){
//        this.qualification=qualification;
//    }
    public void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualification(){
        return qualification;
    }
    public void setQualification(String qualification){
        this.qualification=qualification;
    }

//    public Nurse getNurse() {
//        return nurse;
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
    @Override
    public void setBeanName(String name){
        System.out.println("Set Bean name method is called");
    }

    @PostConstruct
    public void postContruct(){
        System.out.println("Post Construct Method is callled");

    }

}
