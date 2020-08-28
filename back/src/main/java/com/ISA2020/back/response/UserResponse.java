package com.ISA2020.back.response;

import com.ISA2020.back.enumerations.UsersEnum;

import lombok.AllArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@AllArgsConstructor
public class UserResponse {

    @Id
    Long id;
    @NotBlank
    String email;
    @NotBlank
    UsersEnum tipKorisnika;
}
