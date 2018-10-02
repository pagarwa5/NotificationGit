package com.notification.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.notification.model.FileStorageProperties;

@SpringBootApplication  
@EnableJpaAuditing
@EnableTransactionManagement
@EnableConfigurationProperties({
	FileStorageProperties.class
})

@EnableJpaRepositories(basePackages = {"com.notification.repositories"} )
@EntityScan("com.notification.entity")
@ComponentScan(basePackages = {"com.notification"} )
public class SpringBootExampleApplication extends SpringBootServletInitializer{  
    public static void main(String[] args) {  
        SpringApplication.run(SpringBootExampleApplication.class, args);  
    } 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootExampleApplication.class);
    	
    }
}