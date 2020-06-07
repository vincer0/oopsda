package com.tasks.person;

/*### Klasa Person
        Zaimplementuj klasę abstrakcyjną `Person`. Klasa powinna zawierać:
        * dwa pola typu String: `name`, `address`
        * konstruktor bezparametrowy ustawiający wartość pól `name` i `address` na pusty String
        * konstruktor z dwoma parametrami: `String name`, `String address`
        * metody typu getter odpowiedzialne za zwracanie wartości zmiennej: `name`, `address`
        * metody typu setter odpowiedzialne za ustawianie wartości pól `name`, `address`
        * metoda `toString` powinna zwracać łańcuch tekstowy o następującym formacie: `?->?`, gdzie `?` to odpowiednio imię i adres;*/

public abstract class Person {
    private String name;
    private String address;

    Person() {
        this.name = "";
        this.address = "";
    }

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s->%s", name, address);
    }
}
