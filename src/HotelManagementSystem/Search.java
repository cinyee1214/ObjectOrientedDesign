package HotelManagementSystem;

import java.util.Date;
import java.util.List;

public interface Search {
    public List<Room> search(RoomStyle style, Date startDate, int duration);
}
