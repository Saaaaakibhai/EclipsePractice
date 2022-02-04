package Task02;
public class Car extends Vehicle implements Runnable{

    public Car(String color, int IDnumber, String model) throws InputWrongException {
        super(color, IDnumber, model);
    }

    @Override
    public void wheels() {
        System.out.println("A car has four wheels");
    }

    @Override
    public boolean equals(Object obj){
        if(getModel().equals(((Vehicle)obj).getModel())) return true;
        else return false;
    }

    @Override
    public void HowToRun() {
        System.out.println("A car runs with diesel");
    }

    @Override
    public String toString() {
        return "Car: " +
                "\ncolor='" + getColor() +
                "\nIDnumber=" + getIDnumber() +
                "\nmodel='" + getModel();
    }
}
