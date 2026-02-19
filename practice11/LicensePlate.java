package practice11;

import java.time.LocalDate;
import java.util.Objects;

public class LicensePlate {
    private final String plateNumber;
    private final LocalDate registrationDate;
    private final LocalDate expirationDate;

    private Car car;

    public LicensePlate(String plateNumber, LocalDate registrationDate, LocalDate expirationDate) {
        
        if (plateNumber == null || plateNumber.isBlank()) {
            throw new IllegalArgumentException("Plate number cannot be null or empty");
            
        }

        if (expirationDate.isBefore(registrationDate)) {
            throw new IllegalArgumentException("Expiration date cannot be before registration date");   
        }

        this.plateNumber = plateNumber;
        this.registrationDate = registrationDate;
        this.expirationDate = expirationDate;
    }

    void associateCar(Car car) {
        if (this.car != null) {
            throw new IllegalStateException("This license plate is already associated with a car");
            
        }
        this.car = Objects.requireNonNull(car, "Car cannot be null");
    }

    public boolean isValid() {
        LocalDate today = LocalDate.now();
        return !today.isBefore(registrationDate) && !today.isAfter(expirationDate);
    }

    public Car getCar() {
        return car;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}

