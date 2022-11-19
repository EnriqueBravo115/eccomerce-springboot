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
@Table(name = "tbl_review")
public class Review {
    @Id
    @Column(name = "review_id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "stars")
    private String stars;

    @ManyToOne
    @JoinColumn(name = "rev_product")
    Product product;
}
