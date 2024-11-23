package BusReservation;

public class bus {
	
	private int busNo;
	 private boolean ac;
	 private int capacity;       //get and set
	 
	bus(int busNo,boolean ac,int capacity){
		this.busNo=busNo;
		this.ac=ac;
		this.capacity=capacity;
	}
	
	public int getbusNo() {
		return busNo;  
	}
	public boolean isac() {
		return ac;
	}
	
	 int getCapacity(){    //acces method
		 return capacity;
		
	}
	 public void setac(boolean val) {
		 ac=val;
		 
	 }
	 public void setcapacity(int cap) {
		 
		 capacity=cap;
	 }
	 
	 void DisplaybusInfo() {
		 System.out.println("bus no: "+busNo +" Ac:"+ ac +" total capacity:"+ capacity);
		 System.out.println("");
	 }
	
	

}
 