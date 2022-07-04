package com.kenit.customermanagementjpa.intial;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import sun.security.krb5.Config;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
