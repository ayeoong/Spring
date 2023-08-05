package com.in28minutes.learnspringframework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	
	@Bean //이 메서드는 Bean을 생성하며 이 Bean은 Spring 컨테이너가 관리한다.
	public String name() {
		return "Ranga";
	}
}
