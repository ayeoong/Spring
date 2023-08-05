package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1: Launch a Spring Context - 스프링 컨텍스트 시작
		
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2: Configure the things that we want Spring to manage - Spring에서 관리할 항목 구성
		//HelloWorldConfiguration -@Configuration 
		//name - @Bean
		//3: Retrieving Beans managed by Spring - Spring에서 관리하는 Bean를 검색하는 중
		System.out.println(context.getBean("name"));
		
	}

}
