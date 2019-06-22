package com.example.demo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;	

@RestController
public class SimpleLoggerController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	   @RequestMapping("/")
	   String hello(){
	       logger.debug("Debug message");
	       logger.info("Info message");
	       logger.warn("Warn message");
	       logger.error("Error message");
	       return "Done";
	   }
	}

