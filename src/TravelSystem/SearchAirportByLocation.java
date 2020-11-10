package TravelSystem;

import java.util.List;

public class SearchAirportByLocation implements Searchable<Airport> {
    @Override
    public List<Airport> search(String location) {
        return Airport.getAirportLocations().get(location);
    }
}
