package com.bear;
import org.apache.catalina.Context;
import org.apache.catalina.webresources.StandardRoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan // 扫描使用注解方式的servlet
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        return new TomcatEmbeddedServletContainerFactory() {
            @Override
            protected void postProcessContext(Context context) {
                final int cacheSize = 50 * 1024;
                StandardRoot standardRoot = new StandardRoot(context);
                standardRoot.setCacheMaxSize(cacheSize);
                context.setResources(standardRoot);

                logger.info(String.format("New cache size (KB): %d", context.getResources().getCacheMaxSize()));
            }
        };
    }
}