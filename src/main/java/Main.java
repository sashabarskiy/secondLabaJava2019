import mathOperation.MathOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static public void main(String[] args){

        ApplicationContext context =
                new AnnotationConfigApplicationContext("mathOperation");

        MathOperation mathOperation = (MathOperation) context.getBean("multiplication"); // менять тут

        System.out.println(mathOperation.oparate(4,5));


    }

}
