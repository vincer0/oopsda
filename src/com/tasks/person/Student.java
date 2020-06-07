package com.tasks.person;

/*### Klasa Student
        Zaimplementuj klasę `Student`. Klasa ta powinna rozszerzać klasę `Person`. Dodatkowo powinna zawierać:
        * trzy pola: typ studiów, rok studiów, koszt studiów
        * konstruktor z trzema parametrami: typ studiów, rok studiów, koszt studiów
        * metody typu getter dla zdeklarowanych pól
        * metody typu setter dla zdeklarowanych pól
        * metoda `toString` wyświetlająca szczegółowe informacje o studencie*/

public class Student extends Person {
    private String studiesType;
    private byte yearOfStudies;
    private float studiesCost;

    Student(String name, String address, String studiesType, byte yearOfStudies, float studiesCost) {
        super(name, address);
        this.studiesType = studiesType;
        this.yearOfStudies = yearOfStudies;
        this.studiesCost = studiesCost;
    }

    public byte getYearOfStudies() {
        return yearOfStudies;
    }

    public String getStudiesType() {
        return studiesType;
    }

    public float getStudiesCost() {
        return studiesCost;
    }

    public void setStudiesCost(float studiesCost) {
        this.studiesCost = studiesCost;
    }

    public void setStudiesType(String studiesType) {
        this.studiesType = studiesType;
    }

    public void setYearOfStudies(byte yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    @Override
    public String toString() {
        String nameAndAddress = super.toString();
        return String.format("%s, Studies type: %s, Year of studies: %s, Studies Cost: %.2f", nameAndAddress, getStudiesType(), getYearOfStudies(), getStudiesCost());
    }
}
