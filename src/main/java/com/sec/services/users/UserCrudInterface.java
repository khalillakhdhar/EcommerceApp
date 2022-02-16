package com.sec.services.users;

import java.util.List;
import java.util.Optional;

import com.sec.model.users.User;

public interface UserCrudInterface {
User addUser(User u);
List<User> showUsers();
Optional<User> findUserByid(long id);
void deleteUser(long id);

}
