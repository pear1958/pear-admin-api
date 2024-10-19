package com.pear;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.pear.dao")
@SpringBootApplication
public class PearApplication {
  public static void main(String[] args) {
    SpringApplication.run(PearApplication.class, args);
  }
}
