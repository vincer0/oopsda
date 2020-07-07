package com.builder;

public abstract class HouseBuilder {
    protected double area;
    protected int floors;
    protected RoofType roofType;
    protected Material material;
    protected int roomNumber;
    protected int windowNumber;

    public HouseBuilder setArea(double area) {
        this.area = area;
        return this;
    }

    public HouseBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    public HouseBuilder setRoofType(RoofType roofType) {
        this.roofType = roofType;
        return this;
    }

    public HouseBuilder setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public HouseBuilder setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public HouseBuilder setWindowNumber(int windowNumber) {
        this.windowNumber = windowNumber;
        return this;
    }

    public abstract House build();
}
