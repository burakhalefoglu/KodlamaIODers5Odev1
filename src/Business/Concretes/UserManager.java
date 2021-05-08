package Business.Concretes;

import Business.Abstracts.IUserService;
import DataAccess.Abstracts.IUserDal;
import Entities.Concretes.User;
import core.IMessageAdapter;

public class UserManager implements IUserService{

	IUserDal _userDal;
	IMessageAdapter messageAdapter;
	public UserManager(IUserDal _userDal, IMessageAdapter messageAdapter) {
		super();
		this._userDal = _userDal;
		this.messageAdapter = messageAdapter;
	}

	@Override
	public void addUser(User user) {
		
		passwordValidate(user);
		validateEmail(user);
		nameValidate(user);
		
		_userDal.add(user);
		Boolean isSuccess = messageAdapter.sendMessage("Kullanýcýya gönderilecek doðrulama maili");
		if(!isSuccess) {
			System.out.print("Bir hata oluþtu!");

		}
	}

	private void nameValidate(User user) {
		if(user.name.length()<2 || user.surname.length()<2) {
			
			System.out.print("isim veya soy isim en az 2 karakterden oluþmalýdýr!");

		}
	}

	private void validateEmail(User user) {
		if(_userDal.selectbyEmail(user.eposta)!=null) {
			System.out.print("bu eposta adresi kayýtlý!");
			return;
		}
	}

	private void passwordValidate(User user) {
		if(user.password.length()<6) {
			
			System.out.print("þifre en az 6 karakter olmalýdýr!");
			return;
		}
	}

	@Override
	public void dedleteUser(User user) {

		_userDal.delete(user);	
	}

	@Override
	public void updateUser(User user) {

		_userDal.update(user);
	}

	@Override
	public void selectUserbtId(int id) {

		_userDal.selectbyId(id);

		
	}

	@Override
	public void selectUserbyEmail(String email) {

		_userDal.selectbyEmail(email);
		
	}
	
	

	
	
}
