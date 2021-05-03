
public class GameManager implements GameService{

	@Override
	public void campaign(Campaign campaign, Game game) {
		System.out.println(game.getGameName() + " Adlý Oyunda Yeni Kampanya => " + campaign.getCampaignName() + " Kampanyasýyla "
		+ campaign.getCampaignDiscount() + "% Ýndirim ");
		
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " Eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " Güncellendi");
		
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " Silindi");
		
		
	}

	
	

}
