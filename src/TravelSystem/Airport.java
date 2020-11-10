package TravelSystem;

import AirlineManagementSystem.Address;
import AirlineManagementSystem.Flight;

import java.util.HashMap;
import java.util.List;

public class Airport {
    private String name;
    private Address address;
    private String code;

    private static HashMap<String, List<Airport>> airportLocations;
    private static HashMap<String, List<Airport>> airportNames;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static void setAirportLocations(HashMap<String, List<Airport>> airportLocations) {
        Airport.airportLocations = airportLocations;
    }

    public static void setAirportNames(HashMap<String, List<Airport>> airportNames) {
        Airport.airportNames = airportNames;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getCode() {
        return code;
    }

    public static HashMap<String, List<Airport>> getAirportLocations() {
        return airportLocations;
    }

    public static HashMap<String, List<Airport>> getAirportNames() {
        return airportNames;
    }

}
