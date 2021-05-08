package DataAccess.Abstracts;

import Entities.Concretes.User;

public interface IUserDal {

	void add(User user);
	void delete(User user);
	void update(User user);
	User selectbyId(int id);
	User selectbyEmail(String email);
	
}
