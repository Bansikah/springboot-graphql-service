package org.bansikah.inventoryservice;

import jakarta.annotation.PostConstruct;
import org.bansikah.inventoryservice.entity.Product;
import org.bansikah.inventoryservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class InventoryServiceApplication {
   /*+ @Autowired
    private ProductRepository repository;

    @PostConstruct
    public void initDB() {
        List<Product> products = Stream.of(
                new Product("Laptop", "Electronics", 77777.9f, 500),
                new Product("Smartphone", "Electronics", 66666.6f, 300),
                new Product("Headphones", "Audio", 44444.4f, 800),
                new Product("Mouse", "Accessories", 22222.2f, 100),
                new Product("Keyboard", "Accessories", 33333.3f, 700)
                )
                .collect(Collectors.toList());
        repository.saveAll(products);
    }
*/
    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

}
