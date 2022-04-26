package base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import base.service.MyService;

@SpringBootApplication
public class SpringBootProfilesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootProfilesApplication.class, args);
		MyService bean = run.getBean(MyService.class);
		bean.printValues();
	}

}
