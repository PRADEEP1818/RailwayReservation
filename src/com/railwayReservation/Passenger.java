package com.railwayReservation;

public  class Passenger 
{
	public Passenger() 
	{
		
	}

	int id;
	String passengerName;
	int age;
	String gender;
	String birthPreference;
	String allotedSeat;
	int seatnumber;

	
	public Passenger( String passengerName, int age, String gender, String birthPreference) 
	{
		super();
		this.passengerName = passengerName;
		this.age = age;
		this.gender = gender;
		this.birthPreference = birthPreference;
	}
	
	

}
