package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
    	if(this.parkingLot.park(car) != null)
    	{
    		this.lastErrorMessage = null;
    	}
        return this.parkingLot.park(car);

//        throw new RuntimeException("Not implemented");
    }

    public Car fetch(ParkingTicket ticket) {
    	if(ticket == null) {
    		this.lastErrorMessage = "Please provide your parking ticket.";
    	}
        // TODO: Please implement the method
    	else if (this.parkingLot.fetch(ticket) == null) {
        	this.lastErrorMessage = "Unrecognized parking ticket.";
        }
        return this.parkingLot.fetch(ticket);
 //       throw new RuntimeException("Not implemented");
    }

    public String getLastErrorMessage() {
        return this.lastErrorMessage;
    }
}
