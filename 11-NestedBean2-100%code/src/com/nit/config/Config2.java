package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.nit.beans")	
public class Config2 {
	
	public Config2() {
		System.out.println("Config2 :: 0-param constructor");
	}
}
