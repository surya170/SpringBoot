package com.surya.Runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServiceConsumingRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
         // create RestTemplate class object 
		RestTemplate template = new RestTemplate();
		// Define service  url
		String  serviceURL = "http://localhost:8082/SpringBootRestProj13-ProviderApp/actor/wish";
		// Generate http request url with GET mode to consume the web service [ API ]
		ResponseEntity<String> response = template.getForEntity(serviceURL, String.class);
		//display the received details from the response 
		System.out.println("Response body(output)::"+response.getBody());
		System.out.println("Response status code value :: "+response.getStatusCode());
		System.out.println("Response Status code name ::"+response.getStatusCode().name());
		
		System.exit(0);   // optional 
		
	}

}
