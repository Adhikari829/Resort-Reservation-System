package com.example.model;

import java.io.Serializable;

public class Reservation implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private String email;
    private String checkInDate;
    private String checkOutDate;

    // Constructor
    public Reservation(String name, String email, String checkInDate, String checkOutDate) {
        this.name = name;
        this.email = email;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCheckInDate() { return checkInDate; }
    public void setCheckInDate(String checkInDate) { this.checkInDate = checkInDate; }

    public String getCheckOutDate() { return checkOutDate; }
    public void setCheckOutDate(String checkOutDate) { this.checkOutDate = checkOutDate; }
}



