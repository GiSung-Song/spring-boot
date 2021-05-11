/* 메인 클래스*/

package com.practice.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정, 프로젝트의 최상단에 위치해야 함
@SpringBootApplication
//@EnableJpaAuditing //JAP Auditing 활성화
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //.run으로 내장 WAS실행
    }
}
