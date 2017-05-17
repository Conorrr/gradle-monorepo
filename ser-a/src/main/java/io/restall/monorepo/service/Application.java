package io.restall.monorepo.service;

import io.restall.monorepo.libb.Util;
import io.restall.monorepo.liba.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public Service service() {
    return new Service(new Util());
  }

}