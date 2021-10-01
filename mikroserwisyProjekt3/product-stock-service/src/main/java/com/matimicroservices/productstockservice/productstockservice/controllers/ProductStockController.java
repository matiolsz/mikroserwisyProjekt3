package com.matimicroservices.productstockservice.productstockservice.controllers;

import com.matimicroservices.productstockservice.productstockservice.beans.ProductStockBean;
import com.matimicroservices.productstockservice.productstockservice.entity.ProductStock;
import com.matimicroservices.productstockservice.productstockservice.entity.ProductStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductStockController {

    @Autowired
    Environment environment;

    @Autowired
    ProductStockRepository repository;

    @GetMapping("/check-product-stock/productName/{productName}/productAvailability/{productAvailability}")
    public ProductStockBean checkProductStock(@PathVariable String productName,
                                              @PathVariable String productAvailability) {

        ProductStock productStock = repository.findByProductNameAndProductAvailability(productName, productAvailability);

        ProductStockBean productStockBean = new ProductStockBean(
                productStock.getId(),
                productStock.getProductName(),
                productStock.getProductPrice(),
                productStock.getProductAvailability(),
                productStock.getDiscountOffer(),
                Integer.parseInt(environment.getProperty("local.server.port"))

        );

        return productStockBean;
    }
}
