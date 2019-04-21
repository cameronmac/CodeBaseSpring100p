package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nit.beans")
public class config1 {

	public config1(){
		System.out.println("config1. o param cons");
	}
}
