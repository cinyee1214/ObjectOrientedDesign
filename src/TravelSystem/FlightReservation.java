package TravelSystem;

import AirlineManagementSystem.FlightInstance;
import AirlineManagementSystem.FlightSeat;
import AirlineManagementSystem.Passenger;
import AirlineManagementSystem.ReservationStatus;

import java.util.Date;
import java.util.Map;

public class FlightReservation {
    private String reservationNumber;

    private Date creationDate;
    private ReservationStatus status;

    private String customerID;
    private Airport airport;
    private FlightInstance flight;

    public static FlightReservation fetchReservationDetails(String reservationNumber) {
        return null;
    }

}

