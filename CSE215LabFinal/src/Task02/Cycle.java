package Task02;
public class Cycle extends Vehicle implements Runnable{

    public Cycle(String color, int IDnumber, String model) throws InputWrongException {
        super(color, IDnumber, model);
    }

    @Override
    public boolean equals(Object obj){
        if(getModel().equals(((Vehicle)obj).getModel())) return true;
        else return false;
    }

    @Override
    public void wheels() {
        System.out.println("A Cycle has two wheels");
    }

    @Override
    public void HowToRun() {
        System.out.println("A cycle runs with energy");
    }

    @Override
    public String toString() {
        return "Cycle: " +
                "\ncolor='" + getColor() +
                "\nIDnumber=" + getIDnumber() +
                "\nmodel='" + getModel();
    }
}
