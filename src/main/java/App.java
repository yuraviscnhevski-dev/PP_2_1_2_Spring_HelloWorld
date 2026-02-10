import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("HelloWorld bean: " + bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("HelloWorld bean1: " + bean1.getMessage());  // Исправлено!


        // Получаем ДВА раза бин Cat (singleton)
        Cat bean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println("Cat bean2: " + bean2.getMessage());  // Исправлено!

        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        System.out.println("Cat bean3: " + bean3.getMessage());  // Исправлено!

        // Сравниваем ссылки
        System.out.println("\n=== Сравнение ссылок ===");
        System.out.println("HelloWorld bean == HelloWorld bean1? " + (bean == bean1));
        System.out.println("Cat bean2 == Cat bean3? " + (bean2 == bean3));


    }
}