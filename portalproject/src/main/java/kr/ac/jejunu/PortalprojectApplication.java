package kr.ac.jejunu;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@ComponentScan
@Configuration
@EnableAutoConfiguration
public class PortalprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalprojectApplication.class, args);

	}

	@Bean
	public InternalResourceViewResolver setupViewResolver() {

		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		resolver.setSuffix(".jsp");
		return resolver;
	}

}
