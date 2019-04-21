package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages="com.nit.beans")	
public class config2 {

	
	
	public config2() {
		System.out.println("config2.  0 param cons");
	}
}
