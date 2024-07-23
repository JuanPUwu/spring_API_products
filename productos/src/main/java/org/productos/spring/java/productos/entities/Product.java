package org.productos.spring.java.productos.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "products")

public class Product {

    private Long id;
    private String nombre;
    private Double precio;

}
