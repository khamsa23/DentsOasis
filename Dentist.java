import java.util.ArrayList;

public class Dentist 
{
    private String name;
    private String phoneNumber;
    private String email;
    private String city;
    private String dentistSpecialty;
    private String dentistExperience;
    private String dentistQualification;
    
    private ArrayList<Appointment> appointments;
	
    public Dentist( ){
        
    }
    public Dentist(String name) {
        this.name = name;
    }
    public Dentist (String name, String phoneNumber, String email, String city,
            String dentistSpecialty, String dentistExperience, String dentistQualification){
    this.name = name;
	this.phoneNumber = phoneNumber;
	this.email = email;
	this.city = city;
	this.dentistSpecialty = dentistSpecialty;
	this.dentistExperience  = dentistExperience;
	this.dentistQualification= dentistQualification;  
    this.appointments = new ArrayList<>();
    }
    public ArrayList<Appointment> getAppointments(){
        return appointments;
    }
    
    public void addAppointment(Appointment appointment){
        appointments.add(appointment);
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
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getSpecialty() {
        return dentistSpecialty;
    }
    public void setSpecialty(String dentistSpecialty ){
        this.dentistSpecialty = dentistSpecialty;
    }
    public String getExperience(){
        return dentistExperience;
    }
    public void setExperience(String dentistExperience){
        this.dentistExperience = dentistExperience;
    }
    public String getQualification(){
        return dentistQualification;
    }
    public void setDentistQualification(String dentistQualification){
        this.dentistQualification = dentistQualification;
    }	
}
