package com.spring.security.securitydemo.config;

import javax.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

/**
 * AclMethodSecurityConfiguration:
 *
 * @author marcosgui
 */
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class AclMethodSecurityConfiguration extends GlobalMethodSecurityConfiguration{

  @Resource
  MethodSecurityExpressionHandler defaultMethodSecurityExpressionHandler;


  @Override
  protected MethodSecurityExpressionHandler createExpressionHandler() {
    return defaultMethodSecurityExpressionHandler;
  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    super.configure(auth);
  }
}
