
public class CellPhone {
	final int SHORT = 10;
	final int MEDIUM = 20;
	final int LONG = 30;
	private double call_duration;
	public static int numberOfCalls;

	CellPhone(){
		numberOfCalls++;
	}
	
	CellPhone(double call_duration){
		this.call_duration = call_duration;
		numberOfCalls++;
	}

	public double getCall_duration() {
		return call_duration;
	}

	public void setCall_duration(double call_duration) {
		this.call_duration = call_duration;
	}
	
	public void makeCall() {
		System.out.println("Making a call.");
	}
	
	public void endCall() {
		System.out.println("End the call.");
	}
	
	public double getCallDuration() {
		return call_duration;
	}
}
