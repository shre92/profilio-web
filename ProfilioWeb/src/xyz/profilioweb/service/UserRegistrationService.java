package xyz.profilioweb.service;

import java.util.List;

import xyz.profilioweb.forms.UserRegistrationForm;
import xyz.profilioweb.model.Users;

public interface UserRegistrationService {
	
	Users findByUsername(String usrUsername);
	 
    void saveUsers(UserRegistrationForm users);
     
    void deleteUsers(String usrUsername);
     
    List<Users> findAllUsers();
}
