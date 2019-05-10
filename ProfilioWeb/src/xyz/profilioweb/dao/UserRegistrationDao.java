package xyz.profilioweb.dao;

import java.util.List;

import xyz.profilioweb.model.Users;

public interface UserRegistrationDao {
	Users findByUsername(String usrUsername);
	 
    void saveUser(Users users);
     
    void deleteUsers(String usrUsername);
     
    List<Users> findAllUsers();
 
}
