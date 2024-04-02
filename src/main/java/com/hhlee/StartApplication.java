package com.hhlee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class}, scanBasePackages = "com.hhlee")
@PropertySources({@PropertySource(value = "classpath:config/application.properties", ignoreResourceNotFound = true)})
public class StartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StartApplication.class, args);
        System.out.println("이렇게 추가했어 추가했어");
        System.out.println("branch 에서 추가했어");

    }
}
