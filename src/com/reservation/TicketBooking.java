package com.reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketBooking {
	ArrayList<TrainTicket> bookedTicket = new ArrayList<>();
	Scanner input = new Scanner(System.in);
	void bookTicket() {
//		System.out.println("bokkkkk");
	    System.out.print("Enter Passenger Name: ");
        String name = input.next();
        System.out.print("Enter Train Number: ");
        int trainNumber = input.nextInt();
        System.out.println("Select Class: 1. Sleeper  2. AC  3. General");
        int choice = input.nextInt();
        
        TrainTicket ticket = null;
        switch (choice) {
		case 1:
			ticket =new SleeperClass(name, trainNumber);
			break;
		case 2:
			ticket = new AcClass(name, trainNumber);
			break;
		case 3:
			ticket = new GeneralClass(name, trainNumber);
		default:
			break;
		}
        bookedTicket.add(ticket);
        System.out.println("Ticket booked successfullyy");
        ticket.displayDetails();
	}
	void cancelTicket() {
//		System.out.println("cancelllll");
		
		
		if (bookedTicket.isEmpty()) { 
			System.out.println("No Ticket foundddddd ");
		} else {
			System.out.println("Enter the passenger name");
			String name = input.next();
			System.out.println("Enter train number");
			int trainNum = input.nextInt();
		
		for (TrainTicket trainTicket : bookedTicket) {
			if (name.equals(trainTicket.getPassengerName()) && trainNum== trainTicket.getTrainNumber()) {
				bookedTicket.remove(trainTicket);
				System.out.println("Ticket cancelled successfully");
				return;
			} 
		
//			else {
//				System.out.println("No Ticket found ");
//			}
		}
		System.out.println("No Ticket found ");
		}
		
	}
	void displayAllTicket() {
//		System.out.println("displyyyyyyyy");
		if (bookedTicket.isEmpty()) {
			System.out.println("No tickets found");
		} else {
			for (TrainTicket trainTicket : bookedTicket) {
				trainTicket.displayDetails();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
