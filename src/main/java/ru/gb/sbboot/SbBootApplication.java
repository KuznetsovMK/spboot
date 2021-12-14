package ru.gb.sbboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableConfigurationProperties(ProductProps.class)

@SpringBootApplication
public class SbBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbBootApplication.class, args);
    }

}
