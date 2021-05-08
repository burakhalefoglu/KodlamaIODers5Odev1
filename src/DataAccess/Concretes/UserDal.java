package DataAccess.Concretes;

import DataAccess.Abstracts.IUserDal;
import Entities.Concretes.User;

public class UserDal implements IUserDal{

	@Override
	public void add(User user) {
		System.out.printf("kullanıcı eklendi");
		
	}

	@Override
	public void delete(User user) {
		System.out.printf("kullanıcı silindi");
		
	}

	@Override
	public void update(User user) {
		System.out.printf("kullanıcı güncellendi");
		
	}

	@Override
	public User selectbyId(int id) {
		System.out.printf("kullanıcı görüntüleniyor!");
		return new User();
		
	}

	@Override
	public User selectbyEmail(String email) {
		// TODO Auto-generated method stub
		return new User();
	}

}
