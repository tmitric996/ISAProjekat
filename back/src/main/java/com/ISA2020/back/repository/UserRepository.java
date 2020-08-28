package com.ISA2020.back.repository;

import com.ISA2020.back.enumerations.UsersEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ISA2020.back.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    List<User> findAllByTipKorisnika(UsersEnum tip);
}
