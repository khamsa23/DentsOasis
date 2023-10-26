import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Appointment {
    private String appointmentTime;
    private String appointmentDate;
    private  int number;  
    private Dentist dentist;
    public Patient patient;

    public Appointment() {     
    	

    }
    
    public Appointment(String appointmentTime, String appointmentDate ) { 
    	this.appointmentTime = appointmentTime;
    	this.appointmentDate = appointmentDate;

    }
    
    public Appointment(int number, String appointmentTime, String appointmentDate) { 
    	this.number = number;
    	this.appointmentTime = appointmentTime;
    	this.appointmentDate = appointmentDate;

    }
    
    public Appointment(Dentist dentist, String patientName, String appointmentTime, String appointmentDate){
        this.dentist = dentist;
        this.appointmentTime = appointmentTime;
        this.appointmentDate = appointmentDate;

    }
  
    public Dentist getDentist(){
        return dentist;
    }


    public String getAppointmentTime() {
        return appointmentTime;
    }

    public String getAppointmentDate(){
        return appointmentDate;
    }
    private  int getNumber(){
        return number;
    }
    
    public static void promptUserToChooseAppointment(ArrayList<Dentist> dentists) throws IOException{
    	    Scanner scanner = new Scanner(System.in);

    	    System.out.print("\nPlease enter your dentist's name: ");
    	    String input = scanner.nextLine();
    	    
    	    Dentist dentist = null;
    	    for (Dentist currentDentist : dentists) {
    	        if (currentDentist.getName().equalsIgnoreCase(input)) {
    	            dentist = currentDentist;
    	            break;
    	        }
    	    }
    	    
    	    if (dentist != null) {
    	    System.out.println("\n>> Appointments for " + dentist.getName() + ":");
    	    ArrayList<Appointment> appointments = dentist.getAppointments();
    	    
    	    // display the appointments
    	    int count = 1;
    	    for (Appointment appointment : appointments)
            {
    	        System.out.println(count + ". Date: " + appointment.getAppointmentDate() + 
    	                           "   Time: " + appointment.getAppointmentTime());
    	        count++;
    	    }

    	    System.out.print("Please enter the number of the appointment you want to select: ");
    	    int selectedAppointment  = scanner.nextInt();

    	    if (selectedAppointment  > 0 && selectedAppointment  <= appointments.size())
            {
                boolean booked = false;
                FileWriter fw = new FileWriter("appointment.txt", true);
                
                try {
                    BufferedReader br = new BufferedReader(new FileReader("appointment.txt"));
                    String line;
                    
                    boolean found = false;
                    
                    while ((line = br.readLine()) != null)
                    {
                        if(line.equals( "Dentist name: " + dentist.getName() +", "+
                                "Appointment number: " + selectedAppointment +", "+ 
                                "Appointment date and time: " + appointments.get(selectedAppointment - 1).toString())){
                            
                            System.out.print("\n>> Sorry appointment is already booked,"
                                    + " \nBook another appointment? choose from menu\n");
                            
                            found = true;
                            break;
                        }  
                    }

                    if(found == false)
                    {
                        try {
                            
                            fw.write("Dentist name: " + dentist.getName() +", "+
                                    "Appointment number: " + selectedAppointment +", "+ 
                                     "Appointment date and time: " + appointments.get(selectedAppointment - 1).toString()+ "\n");
                            
                            booked = true;
                            fw.close();
                            
                            System.out.println("\n>> Appointment is done, get well soon \n" + 
                                    "Your appointment will be on " + appointments.get(selectedAppointment  - 1).toString()); 
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    br.close();
                
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } 
            else {
    	        
    	        System.out.println("\n>> Invalid appointment number.");
    	    }
            
            }
            else {
    	   
    	    System.out.println("\n>> Dentist not found.");
            } 
    }  
    
    public static void cancelAppointment(Scanner scanner) throws IOException 
    {
        System.out.print("\nEnter the Dentist name: ");
        String DentistName = scanner.nextLine();
        
        System.out.print("Enter the appointment number to cancel: ");
        String appointmentNumber = scanner.nextLine();

        File inputFile = new File("appointment.txt");
        File tempFile = new File("temp.txt");

        boolean appointmentFound;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)); 
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            
            String lineToRemove = "Dentist name: " + DentistName + ", " + "Appointment number: " + appointmentNumber;
            String currentLine;
            appointmentFound = false;
            
            while((currentLine = reader.readLine()) != null)
            {
                if(currentLine.startsWith(lineToRemove)) {
                    appointmentFound = true;
                    continue;
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }
        }
        inputFile.delete();
        tempFile.renameTo(inputFile);
        
        if(appointmentFound) {
            System.out.println("\n>> Appointment canceled successfully.");
        } 
        else{
            System.out.println("\n>> Sorry, the appointment number or Dentist name you entered does not match any existing appointments "
                    + "\n" + " Please try again.");
        }
    }
    
    public String toString() {
        return  appointmentDate.toString() + " At " + appointmentTime.toString();
    }	
