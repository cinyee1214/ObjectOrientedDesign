package TravelSystem;

import TravelSystem.EnumPackage.RoomStatus;
import TravelSystem.EnumPackage.RoomStyle;
import TravelSystem.POJO.RoomKey;

import java.util.List;

public class Room {
    private String roomNumber;
    private RoomStyle style;
    private RoomStatus status;
    private double bookingPrice;
    private boolean isSmoking;

    private List<RoomKey> keys;

    public boolean isRoomAvailable(){
        return true;
    };
    public boolean checkIn(){
        return false;
    };
    public boolean checkOut(){
        return false;
    };
}
