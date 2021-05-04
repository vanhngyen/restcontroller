package com.example.restcontroller.service;

import com.example.restcontroller.jpa.Product;
import com.example.restcontroller.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//triển khai code biz
@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

//    @Autowired
//    ProductRepository productRepository

    public List<Product> fillAll(){
        return productRepository.findAll();
    }

    public Product save(Product stock){
        return productRepository.save(stock);
    }

    public Optional<Product> findById(Long id){
        return  productRepository.findById(id);
    }

    public void deleteById(Long id){
        productRepository.deleteById(id);
    }


}
