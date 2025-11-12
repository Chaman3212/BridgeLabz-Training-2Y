package Assigment12;

package com.bridgelabz.oops.levelone;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking hb) {
        this(hb.guestName, hb.roomType, hb.nights);
    }

    public void display() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking("Amit", "Deluxe", 3);
        HotelBooking b2 = new HotelBooking(b1);
        b1.display();
        System.out.println();
        b2.display();
    }
}

