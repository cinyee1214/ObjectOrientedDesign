package TravelSystem;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Filter implements Search {
    private HashMap<String, List<Hotel>> hotelNames;
    private HashMap<String, List<Hotel>> hotelLocations;
    private HashMap<String, List<Hotel>> hotelRankings;
    private HashMap<Integer, List<Hotel>> hotelCosts;

    public List<Hotel> searchByName(String name) {};
    public List<Hotel> searchByLocation(String location) {};
    public List<Hotel> searchByRanking(String ranking) {};
    public List<Hotel> searchByCost(int cost) {};

    public List<Hotel> searchByAvailability(RoomStyle style, Date startDate, int duration) {
        return Hotel.getAvailableHotels(style, startDate, duration);
    };
}
