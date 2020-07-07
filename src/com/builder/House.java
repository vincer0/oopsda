package com.builder;

public class House {
    private double area;
    private int floors;
    private RoofType roofType;
    private Material material;
    private int roomNumber;
    private int windowNumber;

    public House(double area, int floors, RoofType roofType, Material material, int roomNumber, int windowNumber) {
        this.area = area;
        this.floors = floors;
        this.roofType = roofType;
        this.material = material;
        this.roomNumber = roomNumber;
        this.windowNumber = windowNumber;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public RoofType getRoofType() {
        return roofType;
    }

    public void setRoofType(RoofType roofType) {
        this.roofType = roofType;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getWindowNumber() {
        return windowNumber;
    }

    public void setWindowNumber(int windowNumber) {
        this.windowNumber = windowNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", floors=" + floors +
                ", roofType=" + roofType +
                ", material=" + material +
                ", roomNumber=" + roomNumber +
                ", windowNumber=" + windowNumber +
                '}';
    }
}
