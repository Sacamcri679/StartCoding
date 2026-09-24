package DataStructuresAndAlgorithms.Lab2;

//import com.lesson.lab.model.Seat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeatBooking {
    // List to store bookings
    private List<Seat> bookedSeatsList;
    // Constructor
    public SeatBooking() {
        // Initialize the list of booked seats
        // TODO 1 : this.bookedSeatsList = ?
        this.bookedSeatsList = new ArrayList<>();
    }
    // Method to add a new seat booking
    public void addNewBooking(String seatNumber) {
        // TODO 2: check if the seat is already booked and not canceled
        for(Seat seat : bookedSeatsList) {
            if(seat.getSeatNumber().equals(seatNumber) && seat.isBooked()) {
                System.out.println("Seat " + seatNumber + " is already booked.");
                return;
            }
        }
        // TODO 3 create a new Seat object for the booking,
        Seat newSeat = new Seat(seatNumber);
        // mark the seat as booked,
        newSeat.setBooked(true);
        // set the current date as the booking date
        newSeat.setBookingDate( new Date());
        // TODO 4: add the new seat to the bookedSeatsList
        bookedSeatsList.add(newSeat);
        // TODO 5: confirm the booking to the user
        System.out.println("Seat " + seatNumber + "successfully booked on " + newSeat.getBookingDate());
    }
    // Method to cancel a booking
    public void cancelBooking(String seatNumber) {
        // TODO 6: iterate through the list of booked seats
        for (Seat seat : bookedSeatsList) {
            if(seat.getSeatNumber().equals(seatNumber) && seat.isBooked()) {
                seat.setBooked(false);
                System.out.println("Seat " + seatNumber + " booking has been successfully canceled.");
                return;
            }
        }
        // TODO 7: check if the seat number matches and is not already canceled
        // mark the seat as canceled
        // mark the seat as not booked
        // confirm the cancellation to the user
        // TODO 8: inform the user if no booking was found for the seat number
        System.out.println("No booking was found for seat " + seatNumber);
    }
    // Method to update a booking seat number
    public void updateBooking(String oldSeatNumber, String newSeatNumber) {
        // TODO 9: iterate through the list of booked seats
        for (Seat seat : bookedSeatsList) {
            if (seat.getSeatNumber().equals(oldSeatNumber) && seat.isBooked()) {
                seat.setSeatNumber(newSeatNumber);
                System.out.println("Booking for seat " + oldSeatNumber + " has been successfully updated to " + newSeatNumber);
                return;
            }
        }
        // TODO 10: check if the seat number matches the old seat number and is not canceled
        // TODO 11: update the seat number to the new seat number
        // confirm the update to the user
        // TODO 12: inform the user if no booking was found for the old seat number
        System.out.println("No booking was found for the old seat " + oldSeatNumber);
    }
    // Method to display all bookings
    public void displayBookings() {
        // TODO 13: check if the bookedSeatsList is empty, inform the user that no bookings have been made yet
        if (bookedSeatsList.isEmpty()) {
            System.out.println("There are no bookings to display");
            return;
        }
        // TODO 14: iterate through the list of booked seats, Check if the seat is booked and not canceled
        for(Seat seat : bookedSeatsList) {
            if(seat.isBooked()) {
                System.out.println("seat " + seat.getSeatNumber() + " | Date: " + seat.getBookingDate());
            }
        }
        // TODO 15: display the seat number and booking date

    }
}

