package com.tasks.person;

/*### Klasa Staff
        Zaimplementuj klasę `Lecturer`. Klasa ta powinna rozszerzać klasę `Person`. Dodatkowo powinna zawierać:
        * dwa pola: specjalizacja oraz wynagrodzenie
        * konstruktor z dwoma parametrami: specjalizacja, wynagrodzenie
        * metody typu getter dla zdeklarowanych pól
        * metody typu setter dla zdeklarowanych pól
        * metodę `toString` wyświetlającą szczegółowe informację o wykładowcy*/


public class Lecturer extends Person{
    private String specialization;
    private float salary;

    Lecturer(String name, String address, String specialization, float salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        String nameAndAddress = super.toString();
        return String.format("%s, Specialization: %s, Salary: %.2f", nameAndAddress, getSpecialization(), getSalary());
    }

}
