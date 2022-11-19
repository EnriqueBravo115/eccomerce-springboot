package dev.enrique.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tbl_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;

    @Column(name = "name_product")
    private String nameProduct;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "prod_customer")
    Customer customer;
}
