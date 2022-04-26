package base.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service("myService")
@PropertySource("classpath:application.properties")
public class MyService {

	@Value("${spring.datasource.driver-class-name}")
	private String driver;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String user;
	@Value("${spring.datasource.password}")
	private String pwd;

	public void printValues() {
		System.out.println("==========================");
		System.out.println("DRIVER= " + driver);
		System.out.println("URL= " + url);
		System.out.println("USRR= " + user);
		System.out.println("PASSWORD= " + pwd);
		System.out.println("==========================");
	}

}
