package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        String s = context.getBean(String.class);
        System.out.println(s);
        Integer n = context.getBean(Integer.class);
        System.out.println(n);

        Dog d = context.getBean(Dog.class);
        System.out.println(d.getName());

        Double random = Math.random();
        Cat hm = new Cat();
        hm.setName("hm");
        Supplier<Cat> hmSupplier = () -> hm;
        Cat mh = new Cat();
        mh.setName("mh");
        Supplier<Cat> mhSupplier = () -> mh;
        if(random > 0.5){
            context.registerBean("hm", Cat.class, hmSupplier);
        }else{
            context.registerBean("mh", Cat.class, mhSupplier);
        }
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat.getName());
    }
}
