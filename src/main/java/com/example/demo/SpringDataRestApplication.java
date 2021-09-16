package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringDataRestApplication {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void init() {
		userRepository.saveAll(Stream.of(
				new User(1l, "rajesh", "rajesh@gmail.com"),
				new User(2l, "mayur", "mayur@gmail.com"),
				new User(3l, "tushar", "tushar@gmail.com"),
				new User(4l, "ritesh", "ritesh@gmail.com"))
				.collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

}
