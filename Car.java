public class Car implements Vehicle {
    private String id;
    private double dailyRent;
    private VehicleState state;

    public Car(String id, double dailyRent) {
        this.id = id;
        this.dailyRent = dailyRent;
        this.state = new AvailableState(); // Initial state is available
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public double dailyRent() {
        return dailyRent;
    }

    @Override
    public boolean isAvailable() {
        return state.isAvailable();
    }

    @Override
    public void rent() {
        state = state.rent();
    }

    @Override
    public void returnVehicle() {
        state = state.returnVehicle();
    }
    
}
