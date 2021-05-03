
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adl� Kampanya Eklendi => " + campaign.getCampaignDiscount() + "% indirim");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adl� Kampanya G�ncellendi => Yeni Kampanya => " + campaign.getCampaignDiscount()
		+ "% indirim");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adl� Kampanya Silindi => " + campaign.getCampaignId());
		
	}

}
