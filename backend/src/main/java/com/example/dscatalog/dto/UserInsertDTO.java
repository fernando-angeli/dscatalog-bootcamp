package com.example.dscatalog.dto;

import com.example.dscatalog.services.validation.UserInsertValid;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@UserInsertValid
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class UserInsertDTO extends UserDTO{

    private String password;

}
