package xyz.solidnetwork.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class Controller {

	@GetMapping("/path")
	public Resource getResource() {
		Resource resource = new Resource();
		log.info("resource details in GET request = {}", resource);
		return resource;
	}
}
