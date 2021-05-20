 package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	@Override
	public void register(User user) {
		System.out.println(user.getName()+"  Oyuncusu Ba�ar�yla Eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+"  Oyuncusu Ba�ar�yla G�ncellendii");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+"  Oyuncusu Ba�ar�yla Silindi");
	}
	
	
	
}
