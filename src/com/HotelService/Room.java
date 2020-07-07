package com.HotelService;

public class Room {
    private int capacity;
    private boolean isBooked;
    private boolean hasBathroom;
    private BathroomStandard bathroomStandard;

    public Room(int capacity, boolean isBooked) {
        this.capacity = capacity;
        this.isBooked = isBooked;
    }

    public Room withBathroom(BathroomStandard standard) {
        this.hasBathroom = true;
        this.bathroomStandard = standard;
        return this;
    }

    public Room withoutBathroom() {
        this.hasBathroom = false;
        return this;
    }

    public boolean isBooked() {
        return this.isBooked;
    }

    @Override
    public String toString() {
        return String.format("Room of capacity: %d which is ", capacity, isBooked ? "booked" : "not booked");
    }
}
