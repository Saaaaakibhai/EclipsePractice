
import java.util.ArrayList;

public class DiagnosticCenter extends Institution implements Totallnfo {
	private ArrayList<CoronaDay> coronaInfo = new ArrayList<>();
	private int testFee;
	private String activeHour;
	
	public DiagnosticCenter(String userName, String password, String name, String address, String division,
			String phnNo, int testFee, String activeHour) {
		super(userName, password, name, address, division, phnNo);
		this.testFee = testFee;
		this.activeHour = activeHour;
	}

	public DiagnosticCenter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DiagnosticCenter(String userName, String password, String name, String address, String division,
			String phnNo) {
		super(userName, password, name, address, division, phnNo);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<CoronaDay> getCoronaInfo() {
		return coronaInfo;
	}

	public void addDate(int year, int month, int day, int totalTest, int totalAffected, int totalCured, int totalDeath) {
		coronaInfo.add(new CoronaDay(year, month, day, totalTest, totalAffected, totalCured, totalDeath));
	}
	
	public void addDate(int totalTest, int totalAffected, int totalCured, int totalDeath) {
		coronaInfo.add(new CoronaDay(totalTest, totalAffected, totalCured, totalDeath));
	}

	public int getTestFee() {
		return testFee;
	}

	public void setTestFee(int testFee) {
		this.testFee = testFee;
	}

	public String getActiveHour() {
		return activeHour;
	}

	public void setActiveHour(String activeHour) {
		this.activeHour = activeHour;
	}

	@Override
	public int getTotalTest() {
		int total = 0;
		for (int i = 0; i < this.coronaInfo.size(); i++) {
			total += this.coronaInfo.get(i).getTotalTest();
		}
		return total;
	}


	@Override
	public int getTotalAffected() {
		int total = 0;
		for (int i = 0; i < this.coronaInfo.size(); i++) {
			total += this.coronaInfo.get(i).getTotalAffected();
		}
		return total;
	}

	@Override
	public int getTotalCured() {
		int total = 0;
		for (int i = 0; i < this.coronaInfo.size(); i++) {
			total += this.coronaInfo.get(i).getTotalCured();
		}
		return total;
	}

	@Override
	public int getTotalDeath() {
		int total = 0;
		for (int i = 0; i < this.coronaInfo.size(); i++) {
			total += this.coronaInfo.get(i).getTotalDeath();
		}
		return total;
	}

}