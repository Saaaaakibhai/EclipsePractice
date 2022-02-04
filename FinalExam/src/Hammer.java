
public class Hammer extends Tool{
    private double power;



    public Hammer(int length, double power) {
        super(length);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }


    @Override
    public String display() {
        return super.display()+", Hammer's power = "+getPower();
    }
}