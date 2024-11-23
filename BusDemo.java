package BusReservation;



import java.util.Scanner;

import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) {
		
		
		
		ArrayList<bus>buses=new ArrayList<bus>();
		ArrayList<Booking>bookings=new ArrayList<Booking>();
	
		buses.add(new bus(1,true,3));
		buses.add(new bus(2,false,40));
		buses.add(new bus(3,true,55));
		
		
		int userOpt=1;
   try (Scanner scanner = new Scanner(System.in)) {
	for(bus b:buses) {
		   b.DisplaybusInfo();
	   }
	   
			while(userOpt==1) {
			System.out.println("Enter 1 to book and 2 to exit");
	          userOpt=scanner.nextInt();
	          if(userOpt==1) {
	        	Booking booking=new Booking();
	        	
	        if(booking.isAvaliable(bookings,buses)) {
	        	bookings.add(booking);
	        	System.out.println("your book is confirmed");
	        	
	        }
	        else {
	        	System.out.println("soory. Bus is full. Try another bus or date");
	        }
	          }
	       
			}
}
}
		
	}


