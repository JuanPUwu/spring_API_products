package org.productos.spring.java.productos.repositories;

import java.util.List;

import org.productos.spring.java.productos.entities.Product;
import org.springframework.stereotype.Repository;

@Repository

public class ProductRepository {

    //La lista de un repositorio debe ser inmutable: la logica de negocio no modifica la lista de un repositorio
    List<Product> productos = List.of(
        Product.builder()
                .id(1L)
                .nombre("Silla Reclnable")
                .precio(345000.0)
                .build()
                ,
        new Product(2L, "Escritorio", 2000000.0)
    );

    //Metodo (comportamiento) para consultar todos los productos del repository
    public List<Product> findAll(){
        return this.productos;
    }

}
