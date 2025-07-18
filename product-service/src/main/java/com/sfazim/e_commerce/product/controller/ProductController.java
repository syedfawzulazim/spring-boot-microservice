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

//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public List<ProductResponse> getAllProducts(){
//        return productService.getAllProducts();
//    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getAllProducts() throws InterruptedException {
       // runCpuBoundTask();
        return "Syeddd";
    }

    public static void runCpuBoundTask() {
        double result = 0;
        for (int i = 1; i < 1_000_000_000; i++) {
            result += Math.cbrt(i);  // More expensive than sqrt
        }
        System.out.println("Computation finished. Result: " + result);
    }
}
