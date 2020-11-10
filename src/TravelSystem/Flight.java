package TravelSystem;

import AirlineManagementSystem.Airport;
import AirlineManagementSystem.FlightInstance;

import java.util.List;

public class Flight {
    private String flightNumber;
    private Airport departure;
    private Airport arrival;
    private int durationInMinutes;

    private List<FlightInstance> flightInstances;
}
