package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+"  �simli Oyun Ba�ar�yla Eklendii");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+"  �simli oyun Ba�ar�yla G�ncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+"  �simli oyun Ba�ar�yla Slindi");
	}

}
