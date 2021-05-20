package Concrete;

import Abstract.SalesService;
import Entities.Campaing;
import Entities.Game;
import Entities.User;

public class SalesManager implements SalesService {

	@Override
	public void add(Game game, User user, Campaing campaing) {
		System.out.println(game.getGameName()+"  �simli Oyun "+user.getName()+"  �simli Kulan�c�n�n Hesab�na Eklendi");
		System.out.println(campaing.getCampaingName()+" Kampanya Uyguland�");
		
		
	}

	@Override
	public void gamegift(Game game, User user, Campaing campaing) {
		System.out.println(game.getGameName()+"  �simli Oyun "+user.getName()+"  �simli Kulan�c�n�n Hesab�na G�nderildi");
		System.out.println(campaing.getCampaingName()+" Kampanya Uyguland�");
		

	}

	@Override
	public void refund(Game game, User user, Campaing campaing) {
		System.out.println(game.getGameName()+"  Adl� oyun  "+user.getName()+"  �simli oyuncu taraf�ndan iptal edildi");
		System.out.println(game.getPrice()+"  Tutar�nda �deme "+user.getName()+" �simli oyuncunun Hesab�na �ade Edildi");

		
	}
	

}
