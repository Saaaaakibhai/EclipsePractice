import java.util.GregorianCalendar;

public class CoronaDay {
    GregorianCalendar calendar;
    private int totalTest;
    private int totalAffected;
    private int totalCured;
    private int totalDeath;

    public CoronaDay(int totalTest, int totalAffected, int totalCured, int totalDeath) {
        super();
        this.calendar = new GregorianCalendar();
        this.totalTest = totalTest;
        this.totalAffected = totalAffected;
        this.totalCured = totalCured;
        this.totalDeath = totalDeath;
    }


    public CoronaDay(int year, int month, int day, int totalTest, int totalAffected, int totalCured, int totalDeath) {
        super();
        this.calendar = new GregorianCalendar(year, month, day);
        this.totalTest = totalTest;
        this.totalAffected = totalAffected;
        this.totalCured = totalCured;
        this.totalDeath = totalDeath;
    }


    public CoronaDay() {
        super();
    }


    public GregorianCalendar getCalendar() {
        return calendar;
    }


    public void setCalendar(int year, int month, int day) {
        this.calendar = new GregorianCalendar(year, month, day);
    }


    public int getYear() {
        return this.calendar.get(GregorianCalendar.YEAR);
    }


    public int getMonth() {
        return this.calendar.get(GregorianCalendar.MONTH);
    }


    public int getDay() {
        return this.calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }


    public int getTotalTest() {
        return totalTest;
    }


    public void setTotalTest(int totalTest) {
        this.totalTest = totalTest;
    }


    public int getTotalAffected() {
        return totalAffected;
    }


    public void setTotalAffected(int totalAffected) {
        this.totalAffected = totalAffected;
    }


    public int getTotalCured() {
        return totalCured;
    }


    public void setTotalCured(int totalCured) {
        this.totalCured = totalCured;
    }


    public int getTotalDeath() {
        return totalDeath;
    }


    public void setTotalDeath(int totalDeath) {
        this.totalDeath = totalDeath;
    }
}