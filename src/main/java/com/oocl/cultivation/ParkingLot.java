package com.oocl.cultivation;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
	private final int capacity;
	private Map<ParkingTicket, Car> cars = new HashMap<>();

	public ParkingLot() {
		this(10);
	}

	public ParkingLot(int capacity) {
		this.capacity = capacity;
	}

	public int getAvailableParkingPosition() {
		return capacity - cars.size();
	}

	public ParkingTicket park(Car car) {
		int availableParkingPosition = this.getAvailableParkingPosition();
		if (availableParkingPosition > 0) {
		ParkingTicket parkingTicket = new ParkingTicket();
		cars.put(parkingTicket, car);
		return parkingTicket;}
		else {
			return null;
		}
	}

	public Car fetch(ParkingTicket ticket) {
		Car car = new Car();
		if (cars.containsKey(ticket)) {
			car = cars.get(ticket);
			cars.remove(ticket);
			return car;
		} else {
			return null;
		}
	}
}
