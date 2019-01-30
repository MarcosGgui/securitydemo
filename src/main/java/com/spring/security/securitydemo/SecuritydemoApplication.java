package com.spring.security.securitydemo;

import com.spring.security.securitydemo.config.ACLContext;
import com.spring.security.securitydemo.config.AclMethodSecurityConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SecuritydemoApplication{

  public static void main(String[] args) {
    SpringApplication.run(SecuritydemoApplication.class, args);
  }

}

