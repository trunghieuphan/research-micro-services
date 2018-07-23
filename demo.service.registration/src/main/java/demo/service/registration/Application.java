package demo.service.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Application {

	
	public static void main(String[] args) {
		SpringApplication.run(demo.service.registration.Application.class, args);
	}
}
