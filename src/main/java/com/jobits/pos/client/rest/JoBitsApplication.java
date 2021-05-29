package com.jobits.pos.client.rest;

import com.jobits.pos.client.tennant.rest.TennantRESTClientConfig;
import com.jobits.pos.core.client.rest.CoreRESTClientConfig;
import com.jobits.pos.reserva.client.rest.ReservaRESTClientConfig;
import org.jobits.db.core.module.DataVersionControlModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    ReservaRESTClientConfig.BASE_PACKAGE,
    CoreRESTClientConfig.BASE_PACKAGE,
    TennantRESTClientConfig.BASE_PACKAGE,
    JoBitsApplication.BASE_PACKAGE
})
public class JoBitsApplication {

    public static final String BASE_PACKAGE = "com.jobits.pos.client.rest";

    public static void main(String[] args) {
        SpringApplication.run(JoBitsApplication.class, args);
    }

}
