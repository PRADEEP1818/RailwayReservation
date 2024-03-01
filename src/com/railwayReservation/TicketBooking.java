package com.railwayReservation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class TicketBooking 
{
	int availablelowerTicket=2;
	int availablemiddleTicket=1;
	int availableupperTicket=1;
	int availableRacTicket=1;
	int availablewaitingTicket=1;
	
	static List <Integer> lowerBirtPreference = new ArrayList<Integer>(Arrays.asList(1,2));
	static List <Integer> middleBirtPreference = new ArrayList<Integer>(Arrays.asList(1));
	static List <Integer> upperBirtPreference = new ArrayList<Integer>(Arrays.asList(1));
	static List <Integer> RacBirtPreference = new ArrayList<Integer>(Arrays.asList(1));
	static List <Integer> WaitingListPreference = new ArrayList<Integer>(Arrays.asList(1));	
	
	static Queue<Integer> waitingList = new LinkedList<Integer>();
	static Queue<Integer> RacList = new LinkedList<Integer>();
	
	static List<Integer> bookedTicketList = new ArrayList<>();
	static Map<Integer,Passenger> ticket_Passenger_details = new HashMap<>();
	
	public void BookTicket(Passenger passenger,int seatnumber , String allotedSeat)
	{
		passenger.seatnumber = seatnumber;
		passenger.allotedSeat=allotedSeat;
		ticket_Passenger_details.put(passenger.id, passenger);
		bookedTicketList.add(passenger.id);
		System.out.println("PassengerName :"+passenger.passengerName);
		System.out.println("PassengerAge :"+passenger.age);
		System.out.println("PassengerGender :"+passenger.gender);
		System.out.println("PassengerSeatNumber :"+passenger.seatnumber);
		System.out.println("PassengerAlloted Berth :"+passenger.birthPreference);
		System.out.println("---------------------------Ticket Booked");
	}
	
}
