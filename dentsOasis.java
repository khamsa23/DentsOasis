import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class dentsOasis
{
    public static void main(String[] args) throws IOException
    {
                Scanner scanner = new Scanner(System.in);
                
                ArrayList<Dentist> dentists = new ArrayList<>();

                Dentist dentist1 = new Dentist("Layan", "0548402813", "layan@gmail.com" , "Makkah", "Orthodontist", "10 years", "phd");
                dentists.add(dentist1);
                Dentist dentist2 = new Dentist("Lama", "0547392023", "lama@gmail.com" , "Jeddah", "Periodontist", "7years", "master");
                dentists.add(dentist2);
                Dentist dentist3 = new Dentist("Raghad", "0585729224", "raghad@gmail.com" , "Riyadh", "Endodontist", "5 years", "bachelor");
                dentists.add(dentist3);
                Dentist dentist4 = new Dentist("Mohammed", "0543839112", "moha@gmail.com" , "Makkah", "Orthodontist", "20 years", "phd");
                dentists.add(dentist4);
                Dentist dentist5 = new Dentist("Aseel", "0543876543", "aseel@gmail.com" , "Jeddah", "Periodontist", "8 years", "phd");
                dentists.add(dentist5);
                Dentist dentist6 = new Dentist("Omar", "0567432567", "omar@gmail.com" , "Riyadh", "Endodontist", "10 years", "master");
                dentists.add(dentist6);
                Dentist dentist7 = new Dentist("Hassan", "0564378932", "hassan@gmail.com" , "Abha", "Pediatric", "25 years", "bachelor");
                dentists.add(dentist7);
                Dentist dentist8 = new Dentist("Jory", "0534289765", "jory@gmail.com" , "Abha", "Pediatric", "5 years", "master");
                dentists.add(dentist8);
                Dentist dentist9 = new Dentist("Majed", "0530987123", "majed@gmail.com" , "Taif", "Maxillofacial", "10 years", "phd");
                dentists.add(dentist9);
                Dentist dentist10 = new Dentist("Abeer", "0578903214", "abeer@gmail.com" , "Taif", "Maxillofacial", "30 years", "bachelor");
                dentists.add(dentist10);
                
                
                
                Appointment appointment1 = new Appointment(1, "10:00 AM", "2023-05-01");
                Appointment appointment2 = new Appointment(2, "8:30 PM", "2023-05-09");
                Appointment appointment3 = new Appointment(2, "11:08 PM", "2023-05-12");
                dentist1.addAppointment(appointment1);
                dentist1.addAppointment(appointment2); 
                dentist1.addAppointment(appointment3);
                
                
                Appointment appointment4 = new Appointment("11:15 AM", "2023-06-20");
                Appointment appointment5 = new Appointment("9:30 AM", "2023-06-15");
                Appointment appointment6 = new Appointment("7:00 PM", "2023-06-08");
                dentist4.addAppointment(appointment4);
                dentist4.addAppointment(appointment5);    
                dentist4.addAppointment(appointment6);
                
                
                Appointment appointment7 = new Appointment("10:35 AM", "2023-05-10");
                Appointment appointment8 = new Appointment("8:00 PM", "2023-06-01");
                dentist3.addAppointment(appointment7);
                dentist3.addAppointment(appointment8);
                
                
                Appointment appointment9 = new Appointment("9:00 AM", "2023-07-01");
                Appointment appointment10 = new Appointment("6:30 PM", "2023-07-17");
                Appointment appointment11 = new Appointment("7:15 PM", "2023-07-25");
                dentist2.addAppointment(appointment9);
                dentist2.addAppointment(appointment10); 
                dentist2.addAppointment(appointment11);   
                
                Appointment appointment12 = new Appointment("9:00 AM", "2023-06-18");
                Appointment appointment13 = new Appointment("8:30 PM", "2023-07-01");
                Appointment appointment14 = new Appointment("10:15 PM", "2023-07-30");
                dentist5.addAppointment(appointment12);
                dentist5.addAppointment(appointment13); 
                dentist5.addAppointment(appointment14); 
                
                Appointment appointment15 = new Appointment("10:00 AM", "2023-06-01");
                Appointment appointment16 = new Appointment("12:30 PM", "2023-06-17");
                Appointment appointment17 = new Appointment("7:15 PM", "2023-07-25");
                dentist6.addAppointment(appointment15);
                dentist6.addAppointment(appointment16); 
                dentist6.addAppointment(appointment17); 
                
                Appointment appointment18 = new Appointment("10:00 AM", "2023-07-05");
                Appointment appointment19 = new Appointment("5:30 PM", "2023-07-20");
                Appointment appointment20 = new Appointment("8:00 PM", "2023-08-01");
                dentist7.addAppointment(appointment18);
                dentist7.addAppointment(appointment19); 
                dentist7.addAppointment(appointment20); 
                
                Appointment appointment21 = new Appointment("12:00 PM", "2023-07-22");
                Appointment appointment22 = new Appointment("3:30 PM", "2023-08-01");
                Appointment appointment23 = new Appointment("7:15 PM", "2023-08-25");
                dentist8.addAppointment(appointment21);
                dentist8.addAppointment(appointment22); 
                dentist8.addAppointment(appointment23); 
                
                Appointment appointment24 = new Appointment("9:00 AM", "2023-08-05");
                Appointment appointment25 = new Appointment("11:30 AM", "2023-08-17");
                Appointment appointment26 = new Appointment("5:15 PM", "2023-08-29");
                dentist9.addAppointment(appointment24);
                dentist9.addAppointment(appointment25); 
                dentist9.addAppointment(appointment26); 
               
                Appointment appointment27 = new Appointment("10:00 AM", "2023-07-24");
                Appointment appointment28 = new Appointment("6:30 PM", "2023-07-27");
                Appointment appointment29 = new Appointment("8:15 PM", "2023-08-01");
                dentist10.addAppointment(appointment27);
                dentist10.addAppointment(appointment28); 
                dentist10.addAppointment(appointment29);   

                System.out.println("\n\n\t*****************************************************************************");
                System.out.println( "\t××××××××××                WELCOME TO THE DENTSOASIS!!              ××××××××××");
                System.out.println("\t*****************************************************************************\n");


                    	System.out.println("\n    *** PATIENT PAGE  ***");
                        System.out.println("*** Choose the following ***");
                        System.out.println("1. Login");
                        System.out.println("2. Register");
                        System.out.println("3. Exit");
                        System.out.print(">> Enter your choice: ");
                        int select;
                        select = scanner.nextInt();
                        scanner.nextLine();
                        
                        ArrayList<Review> Reviews = new ArrayList<>();

                        switch (select) {
                            case 1:
                                if(loginPatient()!= true) 
                                    System.out.println("\n>> Not found");

                                else 
                                {
                                  while(true)
                                  {
                                      System.out.println("\n--------------------------");
                                      System.out.println("    *** PATIENT MENU ***");
                                      System.out.println("1. Search for Dentist");
                                      System.out.println("2. Book an Appointment");
                                      System.out.println("3. Cancel an Appointment");
                                      System.out.println("4. Reviews");
                                      System.out.println("5. Exit");
                                      System.out.println("--------------------------");
                                      System.out.print(">> Enter your choice: ");
                                      int choice = scanner.nextInt();
                                      scanner.nextLine();

                                      switch (choice)
                                      {
                                          case 1:
                                    
                                          System.out.print("\nEnter city: ");
                                          String city = scanner.nextLine();
                                    
                                          System.out.print("Enter specialty: ");
                                          String specialty = scanner.nextLine();
                                    
                                          //call search method
                                          List<Dentist> searchResults = searchDents(city, specialty, dentists);
                                          
                                          if (searchResults.isEmpty()) 
                                          {
                                              System.out.println("\n>> Not found.");
                                              return;
                                          }

                                          // display the search results
                                          System.out.print("\n>> Search results:");
                                    
                                    for (int i = 0; i < searchResults.size(); i++) {
                                        System.out.println();
                                        Dentist dentist = searchResults.get(i);
                                        System.out.println((i + 1) + ". " + dentist.getName() + " - " +
                                                dentist.getSpecialty() + " - " + dentist.getCity()); 
                                    }
                                    //Ask the user to book an appointment
                                    System.out.println("\nBook an appointment? choose from menu ");
                                    
                                    break; // add this break statement
                                case 2:
                                     Appointment.promptUserToChooseAppointment(dentists);
                                     break; 
                                
                                case 3:
                                    Appointment.cancelAppointment(scanner);
                                    break;
                                    
                                case 4:
                                    
                                    
                                    System.out.println("\nChoose the following");
                                    System.out.println("1 - Provide a feedback");
                                    System.out.println("2 - View patients feedback");
                                    //System.out.println("3. Exit");
                                    System.out.print(">> Enter your choice: ");
                                    int choose = scanner.nextInt();

                                    if(choose == 1) {
                                        	 
                                             System.out.println("\nTo give your feedback about a dentist.. Please do the following");
                                             System.out.print("Enter the dentist's name: ");
                                             String input;
                                             scanner.nextLine();
                                             input = scanner.nextLine();
                                     	    
                                             
                                     	    Dentist dentist = null;
                                     	    for (Dentist currentDentist : dentists)
                                            {
                                     	        if (currentDentist.getName().equalsIgnoreCase(input)) {
                                     	            dentist = currentDentist;
                                     	            break;
                                     	        }
                                     	    }
                                     	    if (dentist != null)
                                            {
                                     	    String dentistName = dentist.getName();
                                            
                                            System.out.print("Enter your feedback: ");
                                            String feedback = scanner.nextLine();
                                            
                                            int rating;
                                            do {
                                                System.out.print("Enter your rating (from 1 to 5): ");
                                                rating = scanner.nextInt();
                                            }while (rating < 1 || rating > 5);
                                            
                                            Review dentistReview = new Review();
                                            
                                            dentistReview.setDentist(dentist);
                                            dentistReview.setFeedback(feedback);
                                            dentistReview.setRate(rating);


                                            Reviews.add(dentistReview);
                                             
                                            // Print the review to the console
                                            System.out.println("\n>> Thank you for your feedback");
                                            System.out.println("Dentist: " + dentistReview.getDentist().getName());
                                            System.out.println("Review: " + dentistReview.getFeedback());
                                            System.out.println("Rating: " + dentistReview.getRate());
                                            
                                            }
                                    }                                        	                                        	
                                    
                                    else {
                                    System.out.println("\n>> View patients feedback.\n");

                                                    
                                        	    if (Reviews.isEmpty())
                                                    {
                                        	        System.out.println("\n>> No reviews found.");
                                        	    } 
                                                    else {
                                        	        int count = 1;
                                        	        for(Review review : Reviews)
                                                        {
                                        	            System.out.println("\t----------" +"Review " + count + "----------");
                                        	            System.out.println("\tDentist: " + review.getDentist().getName());
                                        	            System.out.println("\tReview: " + review.getFeedback());
                                        	            System.out.println("\tRating: " + review.getRate());
                                        	            count++;

                                        	        }
                                        	    }
                                        	    break;     
                                    }
                                    break;  
                                
                                case 5:
                                    System.exit(0);
                                    break;
                                default:
                                        System.out.println("\n>> Try again");
                                }
                             
                                   } // end while
                                }
                                break;
                            case 2:
                            	registerPatient();
                                break;
                            case 3:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("\n>> Try again");
                                break;
                        
                        
                                }
    
                }// end main
                
                

    public static ArrayList<Dentist> searchDents(String city, String specialty, ArrayList<Dentist> dentists) throws IOException {
    	ArrayList<Dentist> results = new ArrayList<>();

    	for (Dentist dentist : dentists) {
    	    if (dentist.getCity().equalsIgnoreCase(city) && dentist.getSpecialty().equalsIgnoreCase(specialty)) {
    	        results.add(dentist);
    	    }
    	}

    	return results;
       
    }
    
    public static boolean loginPatient()
    {
          Scanner keyboard = new Scanner(System.in);
 		  Patient patient = new Patient();

         
    	   System.out.println("\n**** Login for Patient **** ");
		   System.out.println("Enter Username :");
		    patient.setUsername(keyboard.nextLine()); 
		   System.out.println("Enter Password : ");
		   patient.setPassword(keyboard.nextLine()); 
		   
    	try {
            Scanner scan = new Scanner(new FileReader("patient.txt"));
    	    while (scan.hasNextLine())
            {
                String line = scan.nextLine();
    	        String[] details = line.split(",");
                if(details[0].equals(patient.getUsername()) && details[1].equals(patient.getPassword()))
                {
                    return true;
                } 
            }
        }
    	catch (FileNotFoundException e) {
            e.printStackTrace();
    	}
        
        return false;
    }
     
       
       public static Patient registerPatient() 
       {   
      	      Scanner keyboard = new Scanner(System.in);
     		  Patient patient = new Patient();
      
     		  
         	   System.out.println("\n**** Register for Patient **** ");
 			   
 			 
 	 			   System.out.println("Enter your username : ");
 	 			   patient.setUsername(keyboard.nextLine()); 
 	 			   if (isValidUsername(patient.getUsername()) != true) {
 	 				 System.out.println(">> Please Try again ");
 	 	 			   System.out.println("Enter valid username : ");
 	 	 			   patient.setUsername(keyboard.nextLine()); 
 	 			   }
 	 			   System.out.println("Enter your password : ");
 	 			   patient.setPassword(keyboard.nextLine()); 
 	 			   
 	 			   
 	 			 if (isValidPassword(patient.getPassword()) != true) {
 	 				 System.out.println(">> Please Try again ");
 	 	 			   System.out.println("Enter valid password : ");
 	 	 				 System.out.println("Should contains numbers, special character,  and length between 8 to 10 ");

 	 	 			   patient.setPassword(keyboard.nextLine()); 
 	 			   }
 	 			 
 	 			   System.out.println("Enter your mobile : ");
 	 			   patient.setPhoneNumber(keyboard.nextLine()); 
 	 			   
 	 			 if (isValidPhoneeNumber(patient.getPhoneNumber()) != true) {
 	 				 System.out.println(">> Please Try again ");
 	 	 			   System.out.println("Enter valid phone number : ");
 	 	 			   patient.setPhoneNumber(keyboard.nextLine()); 
 	 			   }
 	 			   System.out.println("Enter your email : ");
 	 			   patient.setEmail(keyboard.nextLine()); 
 	 			 if (isValidEmail(patient.getEmail()) != true) {
 	 				 System.out.println(">> Please Try again ");
 	 	 			   System.out.println("Enter valid email : ");
 	 	 			   patient.setEmail(keyboard.nextLine()); 
 	 			   }
 	 			   
 	 			   System.out.println("Enter your city : ");
 	 			   patient.setCity(keyboard.nextLine()); 
 			 
 	           try {
 	        	   FileWriter write = new FileWriter("patient.txt", true);
                           PrintWriter print = new PrintWriter(write);
                           print.print(patient.getUsername()+ "," +  patient.getPassword() + "," + 
                                   patient.getPhoneNumber() + "," + patient.getEmail() + "," +
                                   patient.getCity()+ ",\n");
                           System.out.println(">> Successful registration ");
                           print.close();
                   }
                   catch (IOException e) {
                       e.printStackTrace();
                   }
                   return patient;	  
      }
 
       public static boolean isValidUsername(String username) {
    	    String pattern = "^[a-zA-Z0-9]{4,20}$";
    	    return username.matches(pattern);
    	}
       public static boolean isValidPassword(String password) {
    	    boolean hasNumber = password.matches(".*\\d.*");
    	    boolean hasSpecialChar = !password.matches("[a-zA-Z0-9 ]*");
    	    boolean isValidLength = password.length() >= 8 && password.length() <= 10;
    	    return hasNumber && hasSpecialChar && isValidLength;
    	}
       public static boolean isValidPhoneeNumber(String mobileNumber) {
    	    String pattern ="^((\\+|00)966\\s?|0)(5[0-9]{1}|5[5-9]{1}|5[3-4]{1}|59{1}|56{1}|54{1}|53{1})\\s?[0-9]{3}\\s?[0-9]{4}$";
    	    return mobileNumber.matches(pattern);
    	}
       
       public static boolean isValidEmail(String email) {
    	    String pattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    	    return email.matches(pattern);
    	}
}
