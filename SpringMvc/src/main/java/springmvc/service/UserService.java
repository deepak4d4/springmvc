package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.model.User;
import springmvc.usedao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public int createUser(User user) {
		int id = (Integer)this.userDao.saveUser(user);
		System.out.println("service"+user);
		return id;
	}
}
