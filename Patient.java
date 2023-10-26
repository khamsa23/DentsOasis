public class Patient
{
        private String name;
	private String phoneNumber;
	private String email;
	private String username;
	private String password;
	private String city;
	private Appointment appointment;
	
	public Patient () {
		
	}
	public Patient(String name) {
            this.name = name;
        }
	public Patient (String name, String phoneNumber, String email,  String username, String password, String City){ 
        this.name = name;
	    this.phoneNumber = phoneNumber;
	    this.email = email;
	    this.username = username;
	    this.password = password;
	    this.city = city;
	}
	public String getName(){
            return name;
	}
	public void setName(String name){
            this.name = name;
	}
	public String getPhoneNumber(){
            return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
	}
	public String getEmail(){
            return email;
	}
	public void setEmail(String email){
            this.email = email;
	}
	public String getUsername(){
            return username;
	}
	public void setUsername(String username){
            this.username = username;
	}
	public String getPassword(){
            return password;
	}
	public void setPassword(String password){
            this.password = password;
	}
	public String getCity(){
            return city;
	}
	public void setCity(String city) {
            this.city = city;
	}
}
