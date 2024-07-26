package org.bansikah.inventoryservice.resource;

import org.bansikah.inventoryservice.entity.Product;
import org.bansikah.inventoryservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @QueryMapping
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @QueryMapping
    public List<Product> getProductByCategory(@Argument String category) {
        return service.getProductByCategory(category);
    }

    @MutationMapping
    public Product updateProduct(@Argument int id, @Argument int stock){
        return service.updateProduct(id, stock);
    }

    @MutationMapping
    public Product receivedNewShipment(@Argument int id, @Argument int quantity){
        return service.receivedNewShipment(id, quantity);
    }

}
