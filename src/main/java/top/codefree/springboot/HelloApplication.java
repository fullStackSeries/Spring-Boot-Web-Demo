package top.codefree.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@Configuration
public class HelloApplication {

	@RequestMapping(value = "hello")
	@ResponseBody
	public String hello() {
		
		return "hello spring boot";
		
	}

	public static void main(String[] args) {
		
		SpringApplication.run(HelloApplication.class, args);
		
	}

}
