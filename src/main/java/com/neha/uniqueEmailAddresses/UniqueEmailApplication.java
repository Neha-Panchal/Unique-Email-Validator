package com.neha.uniqueEmailAddresses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class UniqueEmailApplication 
{
    public static void main( String[] args )
    {
    	
    		SpringApplication.run(UniqueEmailApplication.class, args);
    	
    }
}
