package com.xpansiv.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.xpansiv")
public class PocApplication {

  public static void main(String[] args) {
    SpringApplication.run(PocApplication.class, args);
  }
}
