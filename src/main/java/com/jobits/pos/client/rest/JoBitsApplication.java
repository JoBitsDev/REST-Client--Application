package com.jobits.pos.client.rest;

import org.jobits.pos.client.tennant.rest.TennantRESTClientConfig;
import com.jobits.pos.core.client.rest.CoreRESTClientConfig;
import com.jobits.pos.reserva.client.rest.ReservaRESTClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    TennantRESTClientConfig.BASE_PACKAGE,
    ReservaRESTClientConfig.BASE_PACKAGE,
    CoreRESTClientConfig.BASE_PACKAGE,
    JoBitsApplication.BASE_PACKAGE
})
public class JoBitsApplication {

    public static final String BASE_PACKAGE = "com.jobits.pos.client.rest";

    public static void main(String[] args) {
        SpringApplication.run(JoBitsApplication.class, args);
    }

}
