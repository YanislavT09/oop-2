package model;

import java.time.LocalDate;

public class Booking {

    private int roomNumber;
    private LocalDate from;
    private LocalDate to;
    private String note;

    public Booking(int roomNumber, LocalDate from, LocalDate to, String note) {
        this.roomNumber = roomNumber;
        this.from = from;
        this.to = to;
        this.note = note;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public String getNote() {
        return note;
    }
}