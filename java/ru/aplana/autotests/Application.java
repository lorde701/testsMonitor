package ru.aplana.autotests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class Application {

//    private static final EntityManagerFactory INSTANCE =
//            Persistence.createEntityManagerFactory("transactions-optional");


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}