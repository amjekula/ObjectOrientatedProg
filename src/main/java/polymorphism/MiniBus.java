package polymorphism;

public class MiniBus implements Vehicle {
    @Override
    public int wheelNum() {
        return 4;
    }

    @Override
    public String vehType() {
        return "Mini Bus";
    }
}
