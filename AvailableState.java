public  class AvailableState implements VehicleState {

    @Override
    public boolean isAvailable() {
        return true;
    }

    @Override
    public VehicleState rent() {
        return new UnavailableState();
    }

    @Override
    public VehicleState returnVehicle() {
        throw new IllegalStateException("Vehicle is already available");
    }
    
}
