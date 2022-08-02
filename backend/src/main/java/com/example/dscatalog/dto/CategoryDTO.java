package com.example.dscatalog.dto;

import com.example.dscatalog.entities.Category;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class CategoryDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public CategoryDTO(Category entity){
        id = entity.getId();
        name = entity.getName();
    }

}
