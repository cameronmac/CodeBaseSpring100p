package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nit.beans")
public class Config1 {

	public Config1(){
		System.out.println("Config1 :: 0-param constructor");
	}
}
