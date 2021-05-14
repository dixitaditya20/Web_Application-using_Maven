package webapp;

public class UserValidationService {
	
	public boolean isUserValid(String User, String Password)
	{
		if(User.equals("adi") && Password.equals("1234"))
			return true;
		
		return false;
	}

}
