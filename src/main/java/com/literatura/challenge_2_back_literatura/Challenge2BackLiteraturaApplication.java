package com.literatura.challenge_2_back_literatura;
import com.literatura.challenge_2_back_literatura.Libreria.Libreria;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Challenge2BackLiteraturaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Challenge2BackLiteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libreria libreria = new Libreria();
		libreria.consumo();

	}
}
