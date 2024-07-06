package br.com.mnader.java_project;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order
public class DevelopmentMain implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Hello World!");
    }
}
