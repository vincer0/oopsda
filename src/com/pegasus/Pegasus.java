package com.pegasus;

public class Pegasus extends Horse implements Flyer, Mythical{
    public static void main(String... args) {
        Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());
    }
}

class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}
interface Flyer {
    default String identifyMyself() {
        return "I am able to fly.";
    }
}
interface Mythical {
    default String identifyMyself() {
        return "I am a mythical creature.";
    }
}
