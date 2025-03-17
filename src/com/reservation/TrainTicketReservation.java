package com.reservation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TrainTicketReservation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBooking system = new TicketBooking();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("\nWelcome to Train Ticket Reservation ");
			System.out.println("\nEnter Your Choice \n1.Book Ticket\n2.Cancel Ticket\n3.Show All Ticket\n4.Exit");
//			int choice = input.nextInt();
            int choice ; 
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!!!!! Please enter a number.");
                input.nextLine();
                continue;  
            }
			switch (choice) {
			case 1:
				system.bookTicket();
				break;
			case 2:
				system.cancelTicket();
				break;
			case 3:
				system.displayAllTicket();
				break;
			case 4:
				System.out.println("Existingggg"); 
				input.close();
				return;
				
			default:
				System.out.println("Invaid input");
				break;
			}
		} 

	}


}
