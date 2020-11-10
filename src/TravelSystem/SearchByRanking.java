package TravelSystem;

import java.util.List;

public class SearchByRanking implements Searchable<Hotel> {

    @Override
    public List<Hotel> search(String ranking) {
        return Hotel.getHotelRankings().get(ranking);
    }
}
