package com.sec.repositories.user;

import org.springframework.data.repository.CrudRepository;

import com.sec.model.users.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
