package com.sec.services.users.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.model.users.User;
import com.sec.services.users.UserSearchImplement;

@RestController
@RequestMapping("user/")
public class UserSearchController {
@Autowired
UserSearchImplement userSearchImplement;
@GetMapping("adresse/{adresse}")
Optional<User> findbyad(@PathVariable(value = "adresse") String adresse)
{
return userSearchImplement.searchAdresse(adresse);	

}
@GetMapping("nom/{nom}")
Optional<User> findbynom(@PathVariable(value = "nom") String nom)
{
return userSearchImplement.searchNom(nom);	

}

@GetMapping("auth/{email}/{password}")
Optional<User> findbymailpass(@PathVariable(value = "email") String email,@PathVariable("password") String password)
{
return userSearchImplement.searchEmailAndPassword(email, password);	

}


}
