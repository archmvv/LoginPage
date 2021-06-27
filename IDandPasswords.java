import java.util.HashMap;

public class IDandPasswords {

		
		HashMap<String,String> logininfo = new HashMap<String, String>();
		
		
		IDandPasswords(){
		
			logininfo.put("Bro", "pizza");
			logininfo.put("Luigi", "pasta");
			logininfo.put("Mario", "abc123");

	}
		protected HashMap getLoginInfo(){
			return logininfo;
		}
		
		 
}
