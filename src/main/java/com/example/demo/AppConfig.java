package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.config.EmployeeConfig;

@EnableAutoConfiguration
@Configuration
@Import({EmployeeConfig.class})
public class AppConfig 
{
	@Bean
		
}
