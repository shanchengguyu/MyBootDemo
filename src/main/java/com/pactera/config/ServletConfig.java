package com.pactera.config;

import com.pactera.filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author James
 * @date 2021/5/6
 * @decription
 */
@Configuration
public class ServletConfig {
	@Bean
	public FilterRegistrationBean<MyFilter> Myfilter(){
		FilterRegistrationBean filterRegistrationBean=new FilterRegistrationBean(new MyFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		return filterRegistrationBean;
	}
}
