package BusReservation;
import java.util.*;
import java.text.ParseException;


import java .text.SimpleDateFormat;

public class Booking {
	
	String pasengerName;
	int busNo; 
	Date date;
	
	Booking(){
		    try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Enter the name: ");

				pasengerName=scanner.nextLine();
				System.out.println("enter the busno:");
				busNo=scanner.nextInt();
				System.out.println("Enter the date dd-MM-yyyy");
				String dateInput=scanner.next();
				SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
				
						try{
					date=dateformat.parse(dateInput);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		    
		
	}
	
		
		public boolean isAvaliable(ArrayList<Booking>bookings,ArrayList<bus>buses) {
			int capacity=0;
			for(bus b:buses) {
				if(b.getbusNo()==busNo) 
					capacity=b.getCapacity();
					
				}
			int booked=0;
			for(Booking b1:bookings) {
				if(b1.busNo==busNo && b1.date.equals(date)) {
					booked++;
			}
				
			}
			return booked<capacity?true:false;
		
		
	
	}
	
		
	
	
}
  