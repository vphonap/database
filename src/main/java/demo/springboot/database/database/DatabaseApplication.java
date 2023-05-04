package demo.springboot.database.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"demo.springboot.database.*"})
//@ComponentScan(basePackages = { "demo.springboog.database.*" })
//@EntityScan(basePackages = {"demo.mypackage.package.entity"})
@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

}
