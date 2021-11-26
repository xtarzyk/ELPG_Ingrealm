package vaaks.ingrealm.ingredient;

import lombok.*;
import vaaks.ingrealm.product.Product;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double rating;
    private String description;

//    @OneToMany
//    private List<Product> products;
}
