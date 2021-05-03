
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adlý Kampanya Eklendi => " + campaign.getCampaignDiscount() + "% indirim");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adlý Kampanya Güncellendi => Yeni Kampanya => " + campaign.getCampaignDiscount()
		+ "% indirim");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " Adlý Kampanya Silindi => " + campaign.getCampaignId());
		
	}

}
