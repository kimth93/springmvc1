package kr.ac.skuniv.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.ac.skuniv.springmvc.controller.HelloController;
import kr.ac.skuniv.springmvc.controller.MemberController;

@Configuration
@EnableWebMvc
@ComponentScan("kr.ac.skuniv")
public class MvcConfig implements WebMvcConfigurer{

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/view/", ".jsp");	//경로지정, 확장자
	}
	
	@Bean
	public HelloController helloController() {
		return new HelloController();
		
		
	}
	
	

}
