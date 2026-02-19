package practice11;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Parvez Hossain", "Toyota", "Camry", 2010);
        System.out.println("Car Age: " + car.calculateAge());
        System.out.println("Is Eligible for Renewal: " + car.isEligibleForRenewal());

        LicensePlate licensePlate = new LicensePlate("XYZ-1234", LocalDate.now(), LocalDate.now().plusYears(1));
        car.assignLicensePlate(licensePlate);
        System.out.println("Assigned License Plate: " + car.getLicensePlate().getPlateNumber());
        System.out.println("Is License Plate Valid: " + car.getLicensePlate().isValid());
        System.out.println("License Plate Expiration Date: " + car.getLicensePlate().getExpirationDate());
        System.out.println("Owner Name: " + car.getOwnerName());
    }
}
