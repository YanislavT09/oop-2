package model;

public class Room {

    private int number;
    private int beds;

    public Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }

    public int getNumber() {
        return number;
    }

    public int getBeds() {
        return beds;
    }
}