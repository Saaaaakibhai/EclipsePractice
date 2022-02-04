package Task02;
public abstract class Vehicle {
    private String color;
    private int IDnumber;
    private String model;

    public Vehicle(String color, int IDnumber, String model) throws InputWrongException {
        if(IDnumber<0) throw new InputWrongException("IDnumber cannot be negative");
        else{
            this.color = color;
            this.IDnumber = IDnumber;
            this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(int IDnumber) {
        this.IDnumber = IDnumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void wheels();
}
