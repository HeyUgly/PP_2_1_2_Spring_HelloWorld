import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld firstBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(firstBean.getMessage());
        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(secondBean.getMessage());

        System.out.println(firstBean == secondBean);

        System.out.println();

        Cat firstCatBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(firstCatBean.getMessage());
        Cat secondCatBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(secondCatBean.getMessage());

        System.out.println(firstCatBean == secondCatBean);
    }
}