package com.fazeyna.inventoryservice;

import com.fazeyna.inventoryservice.model.Inventory;
import com.fazeyna.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData (InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("I 13");
			inventory.setQuantity(12);

			Inventory inventory2 = new Inventory();
			inventory2.setSkuCode("I 13 red");
			inventory2.setQuantity(12);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory2);
		};
	}
}
