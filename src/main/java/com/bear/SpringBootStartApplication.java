package com.bear;

import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.util.logging.Logger;

/**
 * 修改启动类，继承 SpringBootServletInitializer 并重写 configure 方法
 * Created by root on 3/29/17.
 */
public class SpringBootStartApplication extends SpringBootServletInitializer  {

    private static final Logger logger = Logger.getLogger(SpringBootStartApplication.class.getName());

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        logger.info("--------------------------------------------");
        logger.info("------------------configure start--------------------------");
        return builder.sources(Application.class);
    }

//    @Override
//    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
//        logger.info("------------------customize start--------------------------");
//        configurableEmbeddedServletContainer.setPort(8088);
//        logger.info("-------------------customize end-------------------------");
//        logger.info("--------------------------------------------");
//
//    }
}
