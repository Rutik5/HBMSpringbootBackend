package com.hbs.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hbs.springboot.model.User;
import com.hbs.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Rutik", "Abhang", "ruthikabhang5@gmail.com"));
		this.userRepository.save(new User("Sameer", "Shaikh", "sammer@gmail.com"));
		this.userRepository.save(new User("Sunil", "Don", "sunil@gmail.com"));
	}

}
