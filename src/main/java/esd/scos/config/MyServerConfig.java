package esd.scos.config;

import esd.scos.servlet.LoginValidatorServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LRK
 * @project_name scosserver
 * @package_name esd.scos.config
 * @date 2018/11/4 14:43
 * @description God Bless, No Bug!
 */
@Configuration
public class MyServerConfig {

    @Bean
    public ServletRegistrationBean<LoginValidatorServlet> myServlet(){
        ServletRegistrationBean<LoginValidatorServlet> registrationBean =
                new ServletRegistrationBean<>(new LoginValidatorServlet(),"/loginServlet");
        return registrationBean;
    }
}
