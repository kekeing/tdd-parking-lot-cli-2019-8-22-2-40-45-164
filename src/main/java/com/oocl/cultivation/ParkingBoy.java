package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
    	ParkingTicket parkingTicket = this.parkingLot.park(car);
    	
    	if(parkingTicket != null)
    	{
    		this.lastErrorMessage = null;
    	}
    	else this.lastErrorMessage = "The parking lot is full.";
    	
        return parkingTicket;

//        throw new RuntimeException("Not implemented");
    }

    public Car fetch(ParkingTicket ticket) {
    	Car car = this.parkingLot.fetch(ticket);
    	if(ticket == null) {
    		this.lastErrorMessage = "Please provide your parking ticket.";
    	}
        // TODO: Please implement the method
    	else if (car == null) {
        	this.lastErrorMessage = "Unrecognized parking ticket.";
        }
        return car;
 //       throw new RuntimeException("Not implemented");
    }

    public String getLastErrorMessage() {
        return this.lastErrorMessage;
    }
}
