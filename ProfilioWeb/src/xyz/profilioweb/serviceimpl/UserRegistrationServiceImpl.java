package xyz.profilioweb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import xyz.profilioweb.dao.UserRegistrationDao;
import xyz.profilioweb.model.Users;
import xyz.profilioweb.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService{

	@Autowired
	private UserRegistrationDao userRegistrationDao;
	
	public Users findByUsername(String usrUsername) {
		return userRegistrationDao.findByUsername(usrUsername);
	}

	public void saveEmployee(Users users) {
		userRegistrationDao.saveUser(users);
	}

	public void deleteUsers(String usrUsername) {
		userRegistrationDao.deleteUsers(usrUsername);
	}

	public List<Users> findAllUsers() {
		return userRegistrationDao.findAllUsers();
	}
}
