package com.example.dscatalog.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserInsertDTO extends  UserDTO{

    private String password;

}
