package com.HotelService;

public class RoomRepository extends DefaultRepository<Room> {

    @Override
    public String getRepositoryName() {
        return "RoomRepository";
    }
}
