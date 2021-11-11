package com.example.demoapi.services;

import com.example.demoapi.models.entities.Product;
import com.example.demoapi.models.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product){
        return  productRepo.save(product);
    }

    public Product findOne(Long id){
        Optional<Product> product = productRepo.findById(id);
        if (!product.isPresent()){
            return null;
        }
        return product.get();
//        return productRepo.findById(id).get();
    }

    public Iterable<Product> findAll(){
        return productRepo.findAll();
    }

    public void removeOne(Long id){
     productRepo.deleteById(id);
    }

    public List<Product> findByName(String nama){
        return productRepo.findByNamaContains(nama);
    }
}
