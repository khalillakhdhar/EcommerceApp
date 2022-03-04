package com.sec.services.users.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.model.users.User;
import com.sec.services.users.UserCrudImplement;

@RestController
@RequestMapping("/user")
@Transactional
@CrossOrigin(origins = "localhost:4200")
public class UserCrudController {
@Autowired
UserCrudImplement userCrudImplement;
@GetMapping
public List<User> findall()
{
return userCrudImplement.showUsers();	

}
@PostMapping
public User addUser(@Valid @RequestBody User u)
{
	return	userCrudImplement.addUser(u);

}
@DeleteMapping("/{id}")
public void deleteUser(@PathVariable(value = "id") long id)
{
userCrudImplement.deleteUser(id);	

}
@GetMapping("/{id}")
public Optional<User> findOneUser(@PathVariable(value = "id") long id)
{
return userCrudImplement.findUserByid(id);	

}





}
