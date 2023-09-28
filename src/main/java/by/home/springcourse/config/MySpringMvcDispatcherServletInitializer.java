package by.home.springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    //благодаря этому методу наше приложение знает в каком классе находится конфигурация
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //благодаря этому методу, все запросы от пользователя будут посылаться на диспатчер сервлет
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
