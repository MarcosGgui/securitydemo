package com.spring.security.securitydemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest( classes = SecuritydemoApplication.class)
public class SpringContextIntegrationTest{

  @Test
  public void whenSpringContextIsBootstrapped_thenNoExceptions() {
  }
}

