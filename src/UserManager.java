
public class UserManager implements UserService{
	
	private EdevletManager eDevletLogger;

	public UserManager(EdevletManager eDevletLogger) {
		this.eDevletLogger = eDevletLogger;
	}

	@Override
	public void register(User user) {
		if(eDevletLogger.check(user) == true) {
			
			System.out.println("Ba�ar�yla Kay�t Olundu: " + user.getFirstName() + user.getLastName());
		}
		else
			System.out.println("L�tfen Ge�erli Kimlik No Giriniz.");
		
	}

	@Override
	public void login(User user) {
		if(eDevletLogger.check(user) == true) {
			
			System.out.println("Ba�ar�yla Giri� Yap�ld�: " + user.getFirstName() + user.getLastName());
		}
		else
			System.out.println("L�tfen Ge�erli Kimlik No Giriniz.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hesab�n�z Ba�ar�yla Silindi.");
		
	}

}
