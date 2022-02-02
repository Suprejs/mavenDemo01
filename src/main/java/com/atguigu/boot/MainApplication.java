package com.atguigu.boot;
import com.atguigu.boot.bean.Car;
import com.atguigu.boot.bean.Pet;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * 标注了该注解的类称为主程序类，作为所有方法的入口
 * @SpringBootApplication //该注解告诉SpringBoot这是一个SpringBoot应用
 * 该主类有一个即可，其余地方编写业务程序即可
 * */
@SpringBootApplication(scanBasePackages = "com.atguigu")
public class MainApplication {
    public static void main(String[] args){
        //获取容器对象run
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //通过容器的方法获取组件名
        String[] names = run.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
        //获取组件的几种方式
       Car car01 = run.getBean("car", Car.class);
       System.out.println(car01);

    }
}
