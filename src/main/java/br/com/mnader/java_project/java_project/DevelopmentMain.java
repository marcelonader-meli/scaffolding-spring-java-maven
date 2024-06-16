package br.com.mnader.java_project.java_project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order
public class DevelopmentMain implements CommandLineRunner {


    @Override
    public void run(String[] args) {
        System.out.println("Hello World!");
    }
}
