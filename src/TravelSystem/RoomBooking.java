package TravelSystem;


import java.util.Date;

public class RoomBooking {
    private String reservationNumber;
    private Date startDate;
    private int durationInDays;
    private RoomBookingStatus status;
    private Date checkin;
    private Date checkout;

    private int guestID;
    private Hotel hotel;
    private Room room;

    public static RoomBooking fectchDetails(String reservationNumber);
}
