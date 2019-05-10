package xyz.profilioweb.daoimpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import xyz.profilioweb.dao.UserRegistrationDao;
import xyz.profilioweb.model.Users;

@Repository
public class UserRegistrationDaoImpl implements UserRegistrationDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public Users findByUsername(String usrUsername) {
		String query = "FROM " + Users.class.getName() + " where usrUsername = '" + usrUsername + "'";
		List<Users> usersList = sessionFactory.getCurrentSession().createQuery(query).list();
		if(usersList != null && !usersList.isEmpty() && usersList.size() == 1) {
			return usersList.get(0);
		}
		return null;
	}

	public void saveUser(Users users) {
		sessionFactory.getCurrentSession().persist(users);
	}

	public void deleteUsers(String usrUsername) {
		Query query = sessionFactory.getCurrentSession().createSQLQuery("delete from Users where usrUsername = '" + usrUsername + "'");
        query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Users> findAllUsers() {
		String query = "FROM " + Users.class.getName();
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}

}
