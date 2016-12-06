package org.devdoc.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gehao
 * @since Created by gehao on 2016/12/6.
 */
@SpringBootApplication
@Slf4j
public class Application implements ApplicationRunner {

    @Value("${bar}")
    private String foo;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

    }
}
