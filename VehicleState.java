public interface VehicleState {
    boolean isAvailable();
    VehicleState rent();
    VehicleState returnVehicle();
}
