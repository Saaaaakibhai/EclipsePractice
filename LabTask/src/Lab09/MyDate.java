package Lab09;
import java.util.Date;
public class MyDate {
	 private Date date;

	    public MyDate() {
	        this.date = new Date();
	    }

	    public Date getDate() {
	        return date;
	    }

	    @Override
	    public String toString() {
	        return "MyDate{" + "date=" + date + '}';
	    }
}
