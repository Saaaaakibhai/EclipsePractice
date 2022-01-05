public class Institution {
	private String userName;
	private String password;
	private String name;
	private String address;
	private String[] divisions = {"Dhaka","Chattogram","Rajshahi","Khulna","Barisal",
			"Sylhet","Rangpur","Mymensingh"};
	private String division;
	private String phnNo;

	public Institution(String userName, String password, String name, String address, String division, String phnNo) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.address = address;
		this.division = division;
		this.phnNo = phnNo;
	}


	public Institution() {
		super();
	}

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDivision() {
		return division;
	}


	public void setDivision(int division) {
		this.division = divisions[division];
	}


	public String getPhnNo() {
		return phnNo;
	}


	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	
	
}