package com.rukshesh.springboot_dto_tutorial.repository;

import com.rukshesh.springboot_dto_tutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
