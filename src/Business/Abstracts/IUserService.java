package Business.Abstracts;

import Entities.Concretes.User;

public interface IUserService {

	void addUser(User user);
	void dedleteUser(User user);
	void selectUserbtId(int id);
	void selectUserbyEmail(String smail);
	void updateUser(User user);
}
