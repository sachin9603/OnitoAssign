package com.example.com.onitoAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class OnitoAssignmentApplication {


	//api to run program with swagger
	//http://localhost:8822/swagger-ui/#/


	//api to run program with "/api/vi
    //http://localhost:8822/api/v1/top-rated-movies

	public static void main(String[] args) {
		SpringApplication.run(OnitoAssignmentApplication.class, args);
	}

}
