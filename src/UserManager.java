
public class UserManager implements UserService{
	
	private EdevletManager eDevletLogger;

	public UserManager(EdevletManager eDevletLogger) {
		this.eDevletLogger = eDevletLogger;
	}

	@Override
	public void register(User user) {
		if(eDevletLogger.check(user) == true) {
			
			System.out.println("Baþarýyla Kayýt Olundu: " + user.getFirstName() + user.getLastName());
		}
		else
			System.out.println("Lütfen Geçerli Kimlik No Giriniz.");
		
	}

	@Override
	public void login(User user) {
		if(eDevletLogger.check(user) == true) {
			
			System.out.println("Baþarýyla Giriþ Yapýldý: " + user.getFirstName() + user.getLastName());
		}
		else
			System.out.println("Lütfen Geçerli Kimlik No Giriniz.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hesabýnýz Baþarýyla Silindi.");
		
	}

}
