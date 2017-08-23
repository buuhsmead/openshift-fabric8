package com.github.buuhsmead.openshift.fabric8.zero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}
