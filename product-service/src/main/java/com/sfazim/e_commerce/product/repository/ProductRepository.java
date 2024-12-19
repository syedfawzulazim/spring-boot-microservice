package com.sfazim.e_commerce.product.repository;

import com.sfazim.e_commerce.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
