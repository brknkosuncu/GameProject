
public class EdevletManager implements EdevletService{
	
	
	public boolean check(User user) {
		
		if(user.getNationalIdentity().length()==11) {
			return true;
		}else {
			return false;
		}
}
}
