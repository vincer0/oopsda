package com.HotelService;

import java.util.ArrayList;

public class RoomService implements RoomServiceAPI {

    private Hotel hotel;
    private CRUDRepository<Room> roomRepository;

    RoomService(Hotel hotel) {
        this.hotel = hotel;
    }

    public ArrayList<Room> getRooms() {
        return hotel.getRoomsList();
    }

    public ArrayList<Room> getBookedRooms() {
        ArrayList<Room> allRooms = hotel.getRoomsList();
        ArrayList<Room> bookedRooms = new ArrayList<Room>();
        for (Room room : allRooms) {
            if(room.isBooked()) {
                bookedRooms.add(room);
            }
        }
        return bookedRooms;
    }

    public ArrayList<Room> getUnBookedRooms() {
        ArrayList<Room> allRooms = hotel.getRoomsList();
        ArrayList<Room> unBookedRooms = new ArrayList<Room>();
        for (Room room : allRooms) {
            if(!room.isBooked()) {
                unBookedRooms.add(room);
            }
        }
        return unBookedRooms;
    }

    @Override
    public void addRoomToService(Room room) {
        roomRepository.add(room);
    }

    @Override
    public void deleteRoomFromService(Room room) {
        roomRepository.delete(room);
    }

    @Override
    public void showServiceRooms() {
        for(Room room : roomRepository.getList()) {
            System.out.println(room);
        }
    }
}
