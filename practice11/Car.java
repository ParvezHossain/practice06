package practice11;

import java.time.Year;
import java.util.Objects;

public class Car {
    private final String ownerName;
    private final String manufacturer;
    private final String model;
    private final int yearOfManufacture;
    private LicensePlate licensePlate;

    public Car(String ownerName, String manufacturer, String model, int yearOfManufacture) {
      
        if (yearOfManufacture > Year.now().getValue()) {
            throw new IllegalArgumentException("Year of manufacture cannot be in the future");
            
        }
      
        this.ownerName = ownerName;
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void assignLicensePlate(LicensePlate licensePlate) {
        if (this.licensePlate != null) {
            throw new IllegalStateException("This car already has a license plate assigned");
            
        }
        this.licensePlate = Objects.requireNonNull(licensePlate, "License plate cannot be null");
        licensePlate.associateCar(this);
    }

    public int calculateAge(){
        return Year.now().getValue() - yearOfManufacture;
    }

    public boolean isEligibleForRenewal(){
        return calculateAge() > 20;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public LicensePlate getLicensePlate() {
        return licensePlate;
    }
}
