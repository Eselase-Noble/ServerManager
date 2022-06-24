package com.brandedhustler.server;

import com.brandedhustler.server.emuneration.Status;
import com.brandedhustler.server.model.Server;
import com.brandedhustler.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.brandedhustler.server.emuneration.Status.SERVER_UP;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepo serverRepo){
		return  args -> {
			serverRepo.save(new Server(null, "192.168.1.160","Ubuntu Linux","16 GB","Person Computer",
					"http://localhost:8080/server/image/server1.png", SERVER_UP));
		};
	}

}
