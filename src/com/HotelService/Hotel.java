package com.HotelService;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private int starsCount;
    private ArrayList<Room> rooms;

    public Hotel(String name, int starsCount) {
        this.name = name;
        this.starsCount = starsCount;
    }

    public Hotel withRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
        return this;
    }

    protected ArrayList<Room> getRoomsList() {
        return rooms;
    }

}
