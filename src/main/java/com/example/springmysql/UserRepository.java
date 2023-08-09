package com.example.springmysql;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
    public User findByEmail(String email);
}
