package com.example.dscatalog.resources.exceptions;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidationError extends StandardError{
    private static final long serialVersionUID = 1L;

    private List<FieldMessage> errors = new ArrayList<>();

    public void addError(String fieldName, String message){
        errors.add(new FieldMessage(fieldName, message));
    }
}
