package com.builder;

public class HouseFactory {
    public static void main(String[] args) {
        House straightRoofHouse = new StraightRoofHouse().setArea(45.00).setFloors(2).setMaterial(Material.CEGŁA).setRoomNumber(7).setWindowNumber(12).build();
        System.out.println(straightRoofHouse);
    }
}
