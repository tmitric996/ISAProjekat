package com.ISA2020.back.converter;

import com.ISA2020.back.model.User;
import com.ISA2020.back.response.UserResponse;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class UserConverter {

    public static UserResponse toResponse(User user){
        return new UserResponse(user.getId(), user.getEmail(), user.getTipKorisnika());
    }

    public static List<UserResponse> toResponses(List<User> userList){
        List<UserResponse> userResponses = new ArrayList<>();
        for(User user : userList){
            userResponses.add(toResponse(user));
        }

        return userResponses;
    }

}