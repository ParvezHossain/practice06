public class VehicleFactory {
    
    public static Vehicle createVehicle(String type, String id, double dailyRent) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car(id, dailyRent);
            // case "bike":
            //     return new Bike(id, dailyRent);
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }
    
}
