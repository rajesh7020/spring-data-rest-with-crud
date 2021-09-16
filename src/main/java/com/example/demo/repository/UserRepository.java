package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.responseDTO.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends JpaRepository<User, Long> {

    UserDTO findByEmail(@Param("email") String email);

    UserDTO findByUsername(@Param("username") String username);
}
