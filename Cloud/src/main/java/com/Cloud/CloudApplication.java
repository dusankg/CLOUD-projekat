package com.Cloud;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApplication.class, args);
		
        Map<String, String> env = System.getenv();
        
        System.out.println(env.get("DBUSERNAME"));
        System.out.println(env.get("DBPASSWORD"));

        for (String envName : env.keySet()) {
           //System.out.format("%s=%s%n",
           //                  envName,
           //                   env.get(envName));
            
        }
	}

}
