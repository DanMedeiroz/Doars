package main.java.Doacoes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "doacoes.demo")
public class DoacaoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DoacaoApplication.class, args);
	}
}