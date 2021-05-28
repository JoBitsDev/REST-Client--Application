package com.jobits.pos.client.rest;

import com.jobits.pos.core.client.rest.CoreRESTClientConfig;
import com.jobits.pos.reserva.client.rest.ReservaRESTClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    ReservaRESTClientConfig.BASE_PACKAGE,
    CoreRESTClientConfig.BASE_PACKAGE,
    "com.jobits.pos.client.rest"})
public class JoBitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JoBitsApplication.class, args);
    }

}
