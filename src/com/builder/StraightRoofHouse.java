package com.builder;

public class StraightRoofHouse extends HouseBuilder {
    @Override
    public House build() {
        return new House(area, floors, RoofType.PROSTY, material, roomNumber, windowNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
