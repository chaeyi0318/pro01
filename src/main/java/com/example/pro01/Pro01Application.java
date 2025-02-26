package com.example.pro01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaAuditing		// JPA 엔티티의 생성, 수정 정보를 자동으로 관리(CreatedDate, LastModifiedDate를 사용해서 정보를 자동으로 기록
@EnableScheduling		// 스케쥴링 기능 활성화
@PropertySource(value = "application.properties")		// properties를 읽어와서 스프링 컨텍스트에 등록
public class Pro01Application {

	public static void main(String[] args) {
		SpringApplication.run(Pro01Application.class, args);
	}

}
