package com.ISA2020.back.request;

import com.ISA2020.back.enumerations.UsersEnum;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserRequest {

    @NotBlank
    String email;
    @NotBlank
    UsersEnum tipKorisnika;
}
