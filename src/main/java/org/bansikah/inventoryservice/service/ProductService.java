package org.bansikah.inventoryservice.service;

import org.bansikah.inventoryservice.entity.Product;
import org.bansikah.inventoryservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    //TODO Implement CRUD operations for Product entity
    @Autowired
    private ProductRepository repository;

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public List<Product> getProductByCategory(String category) {
        return repository.findByCategory(category);
    }
    //TODO sales team want to update the products
    public Product updateProduct(int id, int stock){
        Product existingProduct = repository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Product with id not found"+ id));
        existingProduct.setStock(stock);
        return repository.save(existingProduct);
    }

    //warehouse: received new shipment
    public Product receivedNewShipment(int id, int quantity){
        Product existingProduct = repository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Product with id not found"+ id));
        existingProduct.setStock(existingProduct.getStock()+quantity);
        return repository.save(existingProduct);
    }
}
