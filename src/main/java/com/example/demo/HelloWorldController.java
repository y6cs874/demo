/**
 * 
 */
package com.example.demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Srikanth Neerumalla
 *
 */
@RestController
public class HelloWorldController {

	@GetMapping(path="/hello")
    public ResponseEntity<Object> getEmployees() 
    {
		Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
		Date date = new Date();
		logger.info("Reuqest Received & Processed {} ",date);
        return new ResponseEntity<>("Hello World!!! "+ date, HttpStatus.OK);
    }
}
