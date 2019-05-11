package xyz.profilioweb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.profilioweb.dao.UserRegistrationDao;
import xyz.profilioweb.forms.UserRegistrationForm;
import xyz.profilioweb.model.Users;
import xyz.profilioweb.service.UserRegistrationService;
import xyz.profilioweb.utils.DateUtils;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{

	@Autowired
	private UserRegistrationDao userRegistrationDao;
	
	public Users findByUsername(String usrUsername) {
		return userRegistrationDao.findByUsername(usrUsername);
	}

	public void saveUsers(UserRegistrationForm userReg) {
		Users users = new Users();
		users.setUsrUsername(userReg.getUsername());
		users.setUsrPassword(userReg.getPassword());
		users.setUsrFirstname(userReg.getFirstname());
		users.setUsrLastname(userReg.getLastname());
		users.setUsrGender(userReg.getGender());
		users.setUsrDob(new DateUtils().convertToSqlDate(userReg.getDob()));
		
		userRegistrationDao.saveUser(users);
	}

	public void deleteUsers(String usrUsername) {
		userRegistrationDao.deleteUsers(usrUsername);
	}

	public List<Users> findAllUsers() {
		return userRegistrationDao.findAllUsers();
	}
}
