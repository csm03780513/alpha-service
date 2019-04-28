package com.csm.alphaservice.controllers;

import com.csm.alphaservice.model.Products;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductsController {

    private static Map<String,Products> productsMap =new HashMap<>();

    static {
        Products honey = new Products();
        honey.setId("1");
        honey.setName("Baringo");
        productsMap.put(honey.getName(),honey);

        Products bangi = new Products();
        bangi.setId("30");
        bangi.setName("Kerio");

        productsMap.put(bangi.getName(),bangi);
    }

    @RequestMapping(value = "/products")
    public ResponseEntity<Object> getProductName(){
        System.out.println("Called from beta service");
        return new ResponseEntity<>(productsMap.values(), HttpStatus.OK);
    }
}
