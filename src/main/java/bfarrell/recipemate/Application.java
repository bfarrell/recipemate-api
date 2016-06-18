package bfarrell.recipemate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application  {

	public static void run(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
}