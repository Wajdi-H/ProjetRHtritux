package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class GestionRhApplication {
private static final Logger logger=LogManager.getLogger(GestionRhApplication.class);
public static void main(String[] args) {
logger.info("starter");
SpringApplication app= new SpringApplication(GestionRhApplication.class);
app.run(args);
}

}