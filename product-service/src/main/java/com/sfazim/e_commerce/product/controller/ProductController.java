package com.sfazim.e_commerce.product.controller;

import com.sfazim.e_commerce.product.Service.ProductService;
import com.sfazim.e_commerce.product.dto.ProductRequest;
import com.sfazim.e_commerce.product.dto.ProductResponse;
import com.sfazim.e_commerce.product.model.Product;
import com.sfazim.e_commerce.product.repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse create(@RequestBody ProductRequest productRequest){
        return productService.createProduct(productRequest);
    }

    @GetMapping
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
