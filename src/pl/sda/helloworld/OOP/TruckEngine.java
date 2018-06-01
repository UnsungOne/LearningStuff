package pl.sda.helloworld.OOP;

public class TruckEngine extends Engine {

    boolean hasHalfShifts;


    TruckEngine(boolean hasHalfShifts) {
        super(4.0);
        this.hasHalfShifts = hasHalfShifts;

    }

    @Override
    public String toString() {
        return "TruckEngine{" +
                "hasHalfShifts=" + hasHalfShifts +
                '}' + super.toString();
    }
}
