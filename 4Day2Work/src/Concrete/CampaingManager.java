package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+"  Kampanya Ba�ar�yla Eklendi");
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+"  Kampanya Ba�ar�yla G�ncellendi");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+"  Kampanya Ba�ar�yla Silindi");
	}
	

}
