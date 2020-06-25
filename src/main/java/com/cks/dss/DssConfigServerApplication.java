package com.cks.dss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DssConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DssConfigServerApplication.class, args);
	}

}
