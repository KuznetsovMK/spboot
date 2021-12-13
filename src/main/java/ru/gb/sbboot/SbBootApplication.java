package ru.gb.sbboot;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.gb.sbboot.config.ProductProps;

//@EnableConfigurationProperties(ProductProps.class)

@SpringBootApplication
public class SbBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbBootApplication.class, args);
	}

}
