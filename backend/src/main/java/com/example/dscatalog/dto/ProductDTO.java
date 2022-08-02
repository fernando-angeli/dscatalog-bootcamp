package com.example.dscatalog.dto;

import com.example.dscatalog.entities.Category;
import com.example.dscatalog.entities.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
public class ProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    @Size(min = 5, max = 60, message = "O nome deve ter entre 5 e 60 caracteres.")
    @NotBlank(message = "Campo obrigatório.")
    private String name;
    private String description;
    @Positive(message = "O preço deve ser positivo.")
    private Double price;
    private String imgUrl;
    @PastOrPresent(message = "A data do produto não pode ser futura.")
    private Instant date;
    private List<CategoryDTO> categories = new ArrayList<CategoryDTO>();

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl, Instant date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
        this.date = date;
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        description = product.getDescription();
        price = product.getPrice();
        imgUrl = product.getImgUrl();
        date = product.getDate();
    }

    public ProductDTO(Product product, Set<Category> categories){
        this(product);
        categories.forEach(cat -> this.categories.add(new CategoryDTO(cat)));
    }

}
