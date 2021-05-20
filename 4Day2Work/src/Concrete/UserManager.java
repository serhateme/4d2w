 package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	@Override
	public void register(User user) {
		System.out.println(user.getName()+"  Oyuncusu Başarıyla Eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+"  Oyuncusu Başarıyla Güncellendii");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+"  Oyuncusu Başarıyla Silindi");
	}
	
	
	
}
