package com.reservation;

public class TrainTicket {

	private String passengerName;
	private int trainNumber;
	private String seatClass;
	private double ticketPrice;
	
	public TrainTicket(String passergerName,int trainNumber,String seatClass, double ticketPrice) {
		this.passengerName=passergerName;
		this.trainNumber=trainNumber;
		this.seatClass=seatClass;
		this.ticketPrice=ticketPrice;
	}
	

	public String getPassengerName() {
		return passengerName;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public String getSeatClass() {
		return seatClass;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	void displayDetails() {
		System.out.println("Passerger Name : "+passengerName+" , Train Number : "+trainNumber+" , Seat Class : "+seatClass+" , Ticket Price : "+ticketPrice);
	}

}
