package es.ozona.moira.project.service.navision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MoiraProjectServiceCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoiraProjectServiceCustomerApplication.class, args);
	}

}
