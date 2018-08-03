package gr.cosmart.interview.conf;

import org.springframework.context.annotation.*;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
//import org.springframework.web.multipart.commons.CommonsMultipartResolver;
//import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@EnableWebMvc
@Configuration
//@ComponentScan("gr.cosmart.interview.service")
//@ComponentScan(basePackages = { "gr.cosmart.interview.resource.nav" })
public class MvcConfig implements WebMvcConfigurer {
 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        // to serve static .html pages...
        registry.addResourceHandler("/static/**").addResourceLocations("/resources/static/");
    }
 
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
// 
    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        return bean;
    }
 
    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver getMultipartResolver() {
        return new CommonsMultipartResolver();
    }
 
    @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource getMessageSource() {
        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
        resource.setBasename("classpath:messages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }
 
}