package com.example.myfx;

public class FirstClass extends Passenger implements Fare {         // FirstClass class extends Passenger class and implements Fare interface
     private final double superTax=20000;
    private double FlightDuration;
    
    public FirstClass(String name, String email, long phoneNumber, int age, String ticketClass, double flightDuration) {
        super(name, email, phoneNumber, age, ticketClass);       // Calling the constructor of Passenger class to initialize passenger details
        FlightDuration = flightDuration;
    }

    public double getSuperTax() {
        return superTax;
    }
    
    public double getFlightDuration() {
        return FlightDuration;
    }

    @Override             // Implementation of the CalculateFare method from the Fare interface
    public double CalculateFare() {
        return (baseFare*FlightDuration) + tax - discount + superTax;
    }
    
}