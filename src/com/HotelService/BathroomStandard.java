package com.HotelService;

public enum BathroomStandard {
    FIRST("FIRST CLASS"),
    ECONOMY("ECONOMY CLASS"),
    BUSINESS("BUSINESS CLASS");


    private String bathroomStandard;

    BathroomStandard(String bathroomStandard) {
        this.bathroomStandard = bathroomStandard;
    }
}
