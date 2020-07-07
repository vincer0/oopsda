package com.HotelService;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2, false).withoutBathroom();
        Room room2 = new Room(4, true).withBathroom(BathroomStandard.FIRST);

        Hotel hotel = new Hotel("VeryNiceHotel", 5);
    }
}
