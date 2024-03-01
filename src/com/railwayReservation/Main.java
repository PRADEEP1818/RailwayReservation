package com.railwayReservation;

import java.util.Scanner;

public class Main {

	TicketBooking ticketbooking = new TicketBooking();
	public void checkTickets(Passenger passenger)
	{
		if(ticketbooking.availablelowerTicket>0 ||ticketbooking.availablemiddleTicket>0||ticketbooking.availableupperTicket>0)
		{
			if(passenger.birthPreference.equalsIgnoreCase("l") && ticketbooking.availablelowerTicket>0)
			{
				ticketbooking.BookTicket(passenger,(ticketbooking.lowerBirtPreference.get(0)),passenger.allotedSeat="L");	
				ticketbooking.availablelowerTicket--;
				ticketbooking.lowerBirtPreference.remove(0);
			}
			
			else if(passenger.birthPreference.equalsIgnoreCase("m") && ticketbooking.availablemiddleTicket>0)
			{
				ticketbooking.BookTicket(passenger,(ticketbooking.middleBirtPreference.get(0)),passenger.allotedSeat="m");	
				ticketbooking.availablemiddleTicket--;
				ticketbooking.middleBirtPreference.remove(0);
			}
			
			else if(passenger.birthPreference.equalsIgnoreCase("u") && ticketbooking.availableupperTicket>0)
			{
				ticketbooking.BookTicket(passenger,(ticketbooking.upperBirtPreference.get(0)),passenger.allotedSeat="u");	
				ticketbooking.availableupperTicket--;
				ticketbooking.upperBirtPreference.remove(0);
			}
			
			else if(ticketbooking.availablelowerTicket>0)
			{
				ticketbooking.BookTicket(passenger,(ticketbooking.lowerBirtPreference.get(0)),passenger.allotedSeat="l");
			}

			else if(ticketbooking.availablemiddleTicket>0)
			{
				ticketbooking.BookTicket(passenger,(ticketbooking.middleBirtPreference.get(0)),passenger.allotedSeat="m");
			}
			
			else if(ticketbooking.availableupperTicket>0)
			{
				ticketbooking.BookTicket(passenger,(ticketbooking.upperBirtPreference.get(0)),passenger.allotedSeat="u");
			}

			else
			{
				

			}
			
		 }
		}
	
	public static void main(String[] args) 
	{

		int option=0;
		Scanner s = new Scanner(System.in);
		
		
		
		
		
		do
		{
		System.out.println("1.Book\n2.Cancel\n3.Print Booked Tickets\n4.Print Available tickets\n5.Close Application");
		option=s.nextInt();
		switch(option)
		{
		case 1:
		{
			System.out.println("Enter the Passenger name:");
			String passengerName=s.next();
			System.out.println("Enter the Passenger Age:");
			int age=s.nextInt();
			System.out.println("Enter the Paggenger Gender:[M,F]");
			String gender=s.next();
			System.out.println("Enter the Birth Preference [L,M,U]:");
			String birthPreference=s.next();
			Passenger passenger = new Passenger(passengerName,age,gender,birthPreference);
			Main main = new Main();
			main.checkTickets(passenger);
			break;
		}
		case 2:System.out.println("Cancel Ticket");
		break;
		case 3:System.out.println("Print Booked Tickets");
		break;
		case 4:System.out.println("Print available Tickets");
		break;
		case 5:System.out.println("Close Application");
		break;
		default : System.out.println("Invalid Selection ");
		}
		}while(option!=5);
		
		
		
		
	}

}
