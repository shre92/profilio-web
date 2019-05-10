package xyz.profilioweb.service;

import java.util.List;

import xyz.profilioweb.model.Users;

public interface UserRegistrationService {
	
	Users findByUsername(String usrUsername);
	 
    void saveEmployee(Users users);
     
    void deleteUsers(String usrUsername);
     
    List<Users> findAllUsers();
}
