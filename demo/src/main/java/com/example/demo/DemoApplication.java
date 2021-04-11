package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DemoApplication {
	private static RestTemplate template;
	
	private static String tdbApiKey = "cf2ae1c02fdad952b0d53b54cd25f3c8";
	private static String url = "https://api.themoviedb.org/3/search/movie?api_key="+tdbApiKey+"&query=";
	private static String ourApiKey = "JSQ8DA8q3WCrVCuy7bmAYneddQcsmmYg";
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		template = new RestTemplate();
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/searchMovie")
	public String searchMovie(@RequestParam(value = "title", defaultValue = "") String title, @RequestParam(value = "apiKey", defaultValue = "") String apiKey) {
		
		return (apiKey.equals(ourApiKey)) ? template.getForObject(url + title, String.class, title):"{ error: Unauthorized access }";
		
	}
}