public class RentalService {
    public Rental rentalVehicle(Vehicle vehicle, RentalPeriod period) {


        if (!vehicle.isAvailable()) {
            throw new IllegalStateException("Vehicle is not available");
        }

        System.out.println("Renting vehicle: " + vehicle.getId() + " for " + period.days() + " days.");

        // vehicle.rent(); // Mark the vehicle as rented
        return new Rental(vehicle, period);
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.returnVehicle(); // Mark the vehicle as available again
    }
    
}
