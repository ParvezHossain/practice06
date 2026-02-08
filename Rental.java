public class Rental {
    private final Vehicle vehicle;
    private final RentalPeriod period;
    private double totalCost;

    public Rental(Vehicle vehicle, RentalPeriod period) {
        this.vehicle = vehicle;
        this.period = period;
        this.totalCost = vehicle.dailyRent() * period.days();
        vehicle.rent(); // Mark the vehicle as rented
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public RentalPeriod getPeriod() {
        return period;
    }

    public double getTotalCost() {
        return totalCost;
    }

}
