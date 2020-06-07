package com.tasks.movables;

/**
 * Klasa `MovablePoint` powinna implementować interfejs `Movable` a ponadto powinna zawierać 4 pola typu
 * `int`: `x`, `y`, `xSpeed`, `ySpeed`. Pola `x`, `y` powinny definować współrzędne punktu, natomiast pola `xSpeed`, `ySpeed`
 * powinny określać o ile powinny zmieniać się odpowiednie współrzędne.
 * metody `moveUp()` oraz `moveDown()` powinny każdorazowo zwiększać/zmniejszać wartość współrzędnej `y` o wskazaną wartość: `ySpeed`
 * metody `moveLeft` oraz `moveRight()` powinny kazdorazowo zwiększać/zmniejszać wartość współrzędnej `x` o wskazaną wartość `xSpeed`
 */

public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }

    public void setXspeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYspeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("[%d, %d]", getX(), getY());
    }

    @Override
    public void moveUp() {
        this.y = this.y + this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y = this.y - this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x = this.x - this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x = this.x + this.xSpeed;
    }
}
