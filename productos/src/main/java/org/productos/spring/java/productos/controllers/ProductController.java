package org.productos.spring.java.productos.controllers;

import java.util.List;

import org.productos.spring.java.productos.entities.Product;
import org.productos.spring.java.productos.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")

public class ProductController {

    //Inyectar servicio
    private ProductService service = new ProductService();

    //Primer endpoint: un metodo de controlador
    @GetMapping("/saludo")
    public String saludo(){
        return "Hola Pablo";
    }

    //Segundo endpoint
    //Get: obetener informacion inmutable
    @GetMapping("/{idproducto}")
    public String findProductById(@PathVariable String idproducto) {
        return "Aqui se mostrará el producto cuyo id es: " + idproducto;
    }

    @GetMapping
    public List<Product> findAllProducts(){
        //Utilizar el servicio
        return service.findAllProducts();
    }

}
