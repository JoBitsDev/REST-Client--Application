package com.jobits.pos.client.rest;

import org.jobits.db.core.module.DataVersionControlModule;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        DataVersionControlModule.init();
        return application.sources(JoBitsApplication.class);
    }

}
