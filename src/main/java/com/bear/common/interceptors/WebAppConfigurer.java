package com.bear.common.interceptors;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.Arrays;

/**
 * Created by root on 3/30/17.
 */
@Configuration
public class WebAppConfigurer {


    public FilterRegistrationBean characterEncodingFilter(CharacterEncodingFilter characterEncodingFilter) {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        filterRegistrationBean.setFilter(characterEncodingFilter);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegistrationBean;
    }


    public ServletRegistrationBean dispatcherServlet(DispatcherServlet dispatcherServlet) {
        return new ServletRegistrationBean(dispatcherServlet, "*.htm");
    }
}
