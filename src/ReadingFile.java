import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;


public class ReadingFile {
	public static void main(String[] args) {
	    File file = new File("customers.txt");
	    LinkedList<Customer> ll = new LinkedList<Customer>();
	    try {
	        Scanner sc = new Scanner(file);
	        sc.useDelimiter("\\t");
	        
	        
	        //you must escape the slash of the tab 
	        while (sc.hasNextLine()) {
	        	Customer c = new Customer();
	        	
	            String fullName = sc.next();
	            String title = sc.next();
	            String firstName = sc.next();
	            String lastName = sc.next();
	            String streetAddress = sc.next();
	            String city	= sc.next();
	            String state = sc.next();	
	            String zipCode	= sc.next();
	            String emailAddress	= sc.next();
	            String position	= sc.next();
	            String company = sc.next();
	            
	            sc.nextLine();
	            c.setFullName(fullName);
	            c.setTitle(title);
	            c.setFirstName(firstName);
	            c.setLastName(lastName);
	            c.setStreetAddress(streetAddress);
	            c.setCity(city);
	            c.setState(state);
	            c.setZipCode(zipCode);
	            c.setEmailAddress(emailAddress);
	            c.setPosition(position);
	            c.setCompany(company);
	            
	            //System.out.println(fullName);
	            ll.add(c);
	            

	        }
	        Customer b = ll.getFirst();
	      //  System.out.println("The first element is: " + b.getFullName());
	        printList(ll);
	       
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    
	 } // this is the end of main
	
    private static void printList(LinkedList<Customer> ll){
        for (Customer item: ll){
            System.out.println(item.getFullName());
        }
        
    }//this is the end of printlist
	}//this is the end of class

