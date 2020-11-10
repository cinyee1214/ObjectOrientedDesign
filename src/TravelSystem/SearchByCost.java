package TravelSystem;

import java.util.List;

public class SearchByCost implements Searchable<Hotel> {
    @Override
    public List<Hotel> search(String costs) {
        return Hotel.getHotelCosts().get(costs);
    }
}
