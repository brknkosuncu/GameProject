import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		User user1= new User(1, "Berkan", " KOÞUNCU", "123456789121", LocalDate.of(1997, 9, 03));
		User user2= new User(2, "Ali", " VELÝ", "32165498721", LocalDate.of(2008, 3, 06));
		
		UserManager userManager = new UserManager(new EdevletManager());	
		userManager.register(user1);
		userManager.login(user2);
		userManager.delete(user1);
		userManager.register(user2);
		
		
		Campaign campaign1 = new Campaign(1, "Akþam Pazarý", 45);
		Campaign campaign2 = new Campaign(2, "Pazartesi Sendromu", 35);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign2);
		
		
		Game game1= new Game(1, "NBA", 250);
		Game game2= new Game(2,"FIFA",200);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game2);
		gameManager.update(game2);
		
		gameManager.campaign(campaign1, game2);
		gameManager.campaign(campaign2, game1);
		gameManager.campaign(campaign1, game1);
		
	}

}
