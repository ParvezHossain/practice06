import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Create a vehicle using the factory
        Vehicle car = VehicleFactory.createVehicle("car", "CAR123", 50.0);

        // Create a rental service
        RentalService rentalService = new RentalService();

        // Rent the vehicle for a period
        RentalPeriod period = new RentalPeriod(LocalDate.now(), LocalDate.now().plusDays(3));

        System.out.println("Period" + period.start() + " to " + period.end() + " (" + period.days() + " days)");

        Rental rental = rentalService.rentalVehicle(car, period);
        System.out.println("Vehicle rented: " + rental.getVehicle().getId());

        System.out.println("Total cost: $" + rental.getTotalCost());
        System.out.println("Car available? " + car.isAvailable());

        System.out.println("Next available date: " + period.nextAvailableDate());

        // Return the vehicle
        rentalService.returnVehicle(car);
        System.out.println("Vehicle returned: " + car.getId());
        System.out.println("Car available after return? " + car.isAvailable());
    }
}