package TravelSystem;

import java.util.List;

public class Room implements Search {
    private String roomNumber;
    private RoomStyle style;
    private RoomStatus status;
    private double bookingPrice;
    private boolean isSmoking;

    private List<RoomKey> keys;

    public boolean isRoomAvailable(){};
    public boolean checkIn(){};
    public boolean checkOut(){};
}
