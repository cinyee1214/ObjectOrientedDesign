package TravelSystem;

import AirlineManagementSystem.Aircraft;
import AirlineManagementSystem.FlightSeat;
import AirlineManagementSystem.FlightStatus;
import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class FlightInstance {
    private Date departureTime;
    private String gate;
    private FlightStatus status;

    private Map<Integer, FlightSeat> seatMap;
    private Map<FlightSeat, Integer> priceMap;

    public boolean cancel() {
        return false;
    };
    public void updateStatus(FlightStatus status) {}

    public List<FlightSeat> getAvailableSeats() {
        return null;
    }
}
