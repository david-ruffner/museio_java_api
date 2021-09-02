package com.david.museio;

import com.david.museio.configurations.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MuseioApplication implements CommandLineRunner {

	@Autowired
	private UserConfig userConfig;

	public static void main(String[] args) {
		SpringApplication.run(MuseioApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		for (String attr : userConfig.getRequiredAttrs()) {
			System.out.println(attr);
		}
	}

}
