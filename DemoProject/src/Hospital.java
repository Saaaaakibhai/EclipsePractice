import java.util.ArrayList;

public class Hospital extends Institution implements Totallnfo{
	private String[] categories = {"Public", "Private", "NGO"};
	private String category;
	private ArrayList<CoronaDay> coronaInfo = new ArrayList<>();
	private int testFee;
	private String activeHour;
	private int totalGeneralBed;
	private int engagedGeneralBed;
	private int totalIcu;
	private int engagedIcu;
	
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
		

	public Hospital(String userName, String password, String name, String address, String division, String phnNo,
			String category, ArrayList<CoronaDay> coronaInfo, int testFee, String activeHour, int totalGenralBed,
			int engagedGeneralBed, int totalIcu, int engagedIcu) {
		super(userName, password, name, address, division, phnNo);
		this.category = category;
		this.coronaInfo = coronaInfo;
		this.testFee = testFee;
		this.activeHour = activeHour;
		this.totalGeneralBed = totalGenralBed;
		this.engagedGeneralBed = engagedGeneralBed;
		this.totalIcu = totalIcu;
		this.engagedIcu = engagedIcu;
	}

	public Hospital(String userName, String password, String name, String address, String division, String phnNo) {
		super(userName, password, name, address, division, phnNo);
		// TODO Auto-generated constructor stub
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = categories[category];
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

	public void addDate(int year, int month, int day, int totalTest, int totalAffected, int totalCured, int totalDeath) {
		coronaInfo.add(new CoronaDay(year, month, day, totalTest, totalAffected, totalCured, totalDeath));
	}
	
	public void addDate(int totalTest, int totalAffected, int totalCured, int totalDeath) {
		coronaInfo.add(new CoronaDay(totalTest, totalAffected, totalCured, totalDeath));
	}

	public ArrayList<CoronaDay> getCoronaInfo() {
		return coronaInfo;
	}


	public int getTotalGenralBed() {
		return totalGeneralBed;
	}


	public void setTotalGeneralBed(int totalGeneralBed) {
		this.totalGeneralBed = totalGeneralBed;
	}


	public int getEngagedGeneralBed() {
		return engagedGeneralBed;
	}


	public void setEngagedGeneralBed(int engagedGeneralBed) {
		this.engagedGeneralBed = engagedGeneralBed;
	}
    
    public int getVacantGeneralBed() {
    	return (totalGeneralBed - engagedGeneralBed);
    }
    
	public int getTotalIcu() {
		return totalIcu;
	}


	public void setTotalIcu(int totalIcu) {
		this.totalIcu = totalIcu;
	}

	
	public int getEngagedIcu() {
		return engagedIcu;
	}
    
	public void setEngagedIcu(int engagedIcu) {
		this.engagedIcu = engagedIcu;
	}
	
	public int getVacantIcu() {
		return (totalIcu - engagedIcu);
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
