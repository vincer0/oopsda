package com.advanced;

/*
* Zaimplementuj klasę `Square`, która będzie rozszerzać klasę `Rectangle`.
* Klasa ta nie powinna wprowadzać nowych pól oraz funkcjonalności,
* ale powinna wymuszać na klasie bazowej zachowanie kwadratu.
*/

public class Square extends Rectangle {
    Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }
}
