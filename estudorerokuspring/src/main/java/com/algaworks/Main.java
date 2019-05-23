/**
 * 
 */
package com.algaworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * @author eduardo.sa
 *
 */
@SpringBootApplication
public class Main extends SpringBootServletInitializer{
 
  public static void main(String[] args) throws Exception {
    SpringApplication.run(Main.class, args);
  }
 
}
