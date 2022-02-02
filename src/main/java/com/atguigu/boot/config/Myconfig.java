package com.atguigu.boot.config;
import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.TableName;
import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({Pet.class,User.class})
@Configuration//配置文件注解
public class Myconfig {
    @Bean()//向容器添加组件的注解
    public User user() {//返回对象即为组件，组件名就是方法名
        return new User("tom");
    }
    @Bean
    public Pet pet() {
        return new Pet("bob");
    }

    @Bean()//此处的pet02与pet并非单例
    public Pet pet02() {
        return new Pet("tidy");
    }
}
