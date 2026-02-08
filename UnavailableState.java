public class UnavailableState  implements VehicleState {

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public VehicleState rent() {
        throw new IllegalStateException("Vehicle is already rented!!!");
    }

    @Override
    public VehicleState returnVehicle() {
        return new AvailableState();
    }

}
