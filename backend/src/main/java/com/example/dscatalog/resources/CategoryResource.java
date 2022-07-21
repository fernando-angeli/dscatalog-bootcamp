package com.example.dscatalog.resources;

import com.example.dscatalog.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1L,"Books"));
        categories.add(new Category(2L,"Electronics"));
        return ResponseEntity.ok().body(categories);
    }

}
