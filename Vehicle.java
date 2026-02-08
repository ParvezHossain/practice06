public interface Vehicle {

    String getId();
    double dailyRent();
    boolean isAvailable();
    void rent();
    void returnVehicle();
}