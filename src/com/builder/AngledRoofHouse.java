package com.builder;

public class AngledRoofHouse extends HouseBuilder {
    @Override
    public House build() {
        return new House(area, floors, RoofType.SKOŚNY, material, roomNumber, windowNumber);
    }
}
