package TravelSystem;

import TravelSystem.EnumPackage.HotelRanking;
import TravelSystem.EnumPackage.RoomStyle;
import TravelSystem.POJO.Address;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    private String name;
    private Address locations;
    private HotelRanking ranking;
    private List<Room> room;

    public List<Room> getAvailableRooms(){
        return null;
    }

    private static Map<String, List<Hotel>> hotelNames;
    private static Map<String, List<Hotel>> hotelLocations;
    private static Map<String, List<Hotel>> hotelRankings;
    private static Map<String, List<Hotel>> hotelCosts;

    public String getName() {
        return name;
    }

    public Address getLocations() {
        return locations;
    }

    public HotelRanking getRanking() {
        return ranking;
    }

    public static Map<String, List<Hotel>> getHotelLocations() {
        return hotelLocations;
    }

    public static Map<String, List<Hotel>> getHotelRankings() {
        return hotelRankings;
    }

    public static Map<String, List<Hotel>> getHotelCosts() {
        return hotelCosts;
    }

    public static Map<String, List<Hotel>> getHotelNames() {
        return hotelNames;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocations(Address locations) {
        this.locations = locations;
    }

    public void setRanking(HotelRanking ranking) {
        this.ranking = ranking;
    }

    public static void setHotelNames(HashMap<String, List<Hotel>> hotelNames) {
        Hotel.hotelNames = hotelNames;
    }

    public static void setHotelLocations(HashMap<String, List<Hotel>> hotelLocations) {
        Hotel.hotelLocations = hotelLocations;
    }

    public static void setHotelRankings(HashMap<String, List<Hotel>> hotelRankings) {
        Hotel.hotelRankings = hotelRankings;
    }

    public static void setHotelCosts(HashMap<String, List<Hotel>> hotelCosts) {
        Hotel.hotelCosts = hotelCosts;
    }


}
