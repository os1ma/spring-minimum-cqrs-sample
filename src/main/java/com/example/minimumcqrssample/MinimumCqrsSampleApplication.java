package com.example.minimumcqrssample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MinimumCqrsSampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MinimumCqrsSampleApplication.class, args);
		// MinimumCqrsSampleApplication m =
		 ctx.getBean(MinimumCqrsSampleApplication.class);
        // m.hello();
	}
	// public void hello() {
    //     System.out.println("Hello Spring Boot!!");
    // }

}
