package com.mywebapp.usermanaweb.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository <User,Integer> {
    long countById(Integer id);
}
