import java.time.LocalDate;

public record RentalPeriod(LocalDate start, LocalDate end) {

     public RentalPeriod {
        if (start.isAfter(end)) {
            throw new IllegalArgumentException("Start date must be before end date");
        }
    }

    public LocalDate nextAvailableDate(){
        return end();
    }

     public long days() {
        return java.time.temporal.ChronoUnit.DAYS.between(start, end);
    }
    
}
