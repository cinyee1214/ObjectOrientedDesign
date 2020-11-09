package TravelSystem;

import LibraryManagementSystem.Book;

import java.util.Date;
import java.util.List;

public interface Search {
    public List<Hotel> searchByName(String name);
    public List<Hotel> searchByLocation(String location);
    public List<Hotel> searchByRanking(String ranking);
    public List<Hotel> searchByCost(int cost);
    public List<Hotel> searchByAvailability(RoomStyle style, Date startDate, int duration);
}
