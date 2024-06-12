package com.rukshesh.springboot_dto_tutorial;

import com.rukshesh.springboot_dto_tutorial.model.Location;
import com.rukshesh.springboot_dto_tutorial.model.User;
import com.rukshesh.springboot_dto_tutorial.repository.LocationRepository;
import com.rukshesh.springboot_dto_tutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoTutorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoTutorialApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Gurgaon");
		location.setDescription("Gurgaon is a place to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Rukshesh");
		user1.setLastName("Talwar");
		user1.setEmail("rukshesh.talwar12@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Kurt");
		user2.setLastName("Angle");
		user2.setEmail("kurt@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);
	}
}
