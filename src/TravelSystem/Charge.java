package TravelSystem;

import AirlineManagementSystem.PaymentStatus;

import java.util.Date;

public abstract class Charge<E> {
    public Date issueAt;
    public PaymentStatus status;
    public abstract PaymentStatus getStatus();
}
