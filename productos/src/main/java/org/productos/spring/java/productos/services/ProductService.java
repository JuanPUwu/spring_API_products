package org.productos.spring.java.productos.services;


import java.util.List;

import org.productos.spring.java.productos.entities.Product;
import org.productos.spring.java.productos.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    //Inyectar la dependecia al repositorio
    private ProductRepository repository
    = new ProductRepository();
    
    public List<Product> findAllProducts(){
        return repository.findAll();
    }

}
