package com.example.demoapi.models.repos;

import com.example.demoapi.models.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findByNamaContains(String nama); //mencari data LIKE pada query sql
}
