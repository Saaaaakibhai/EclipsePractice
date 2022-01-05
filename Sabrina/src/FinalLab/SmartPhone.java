package FinalLab;
import java.io.Serializable;
public class SmartPhone extends MyDrive implements Camera,Serializable{
     private int phoneNumber;
     SmartPhone(){
    	 
     }
     SmartPhone(int phoneNumber,double price){
    	 super(null,price);
    	 this.phoneNumber=phoneNumber;
     }
     
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("Picture Snap ");
	}

	@Override
	public void takeVideo() {
		// TODO Auto-generated method stub
		System.out.println("Video Good ");
	}    
	@Override
	public String toString() {
		this.takePicture();
		this.takeVideo();
		this.portable();
		return "SmartPhone [phoneNumber=" + phoneNumber + "]";
	}
	@Override
	public void portable() {
		// TODO Auto-generated method stub
		System.out.println("On Hand");
	}
     
}
