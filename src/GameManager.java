
public class GameManager implements GameService{

	@Override
	public void campaign(Campaign campaign, Game game) {
		System.out.println(game.getGameName() + " Adl� Oyunda Yeni Kampanya => " + campaign.getCampaignName() + " Kampanyas�yla "
		+ campaign.getCampaignDiscount() + "% �ndirim ");
		
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " Eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " G�ncellendi");
		
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " Silindi");
		
		
	}

	
	

}
