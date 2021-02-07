package com.ggomjae.project;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
    이 어노테이션을 선언하면, Spring Batch의 여러 기능들을 사용할 수 있게 됩니다.
    선언하지 않으시면 Spring Batch 기능을 사용할 수 없기 때문에 필수로 선언하셔야만 합니다.
 */
@EnableBatchProcessing
@SpringBootApplication
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }
}
