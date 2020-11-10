package TravelSystem;

import TravelSystem.EnumPackage.RoomBookingStatus;

import java.util.Date;

public class RoomReservation {
    private String reservationNumber;
    private Date startDate;
    private int durationInDays;
    private RoomBookingStatus status;
    private Date checkin;
    private Date checkout;

    private String customerID;
    private Hotel hotel;
    private Room room;

    public static RoomReservation fectchDetails(String reservationNumber) {
        return null;
    }
}
