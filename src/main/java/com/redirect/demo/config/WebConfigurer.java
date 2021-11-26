package com.redirect.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
//    registry.addRedirectViewController("/swagger", "/swagger-ui/");
    registry.addRedirectViewController("/banana", "/swagger");
    registry.addViewController("/arroz").setViewName("forward:swagger");
  }
}
