package FinalLab;
import java.io.Serializable;
public class Laptop extends MyDrive implements Camera,Serializable{
    private String eMail;
    Laptop(){
    	
    }
    Laptop(String eMail,double price){
    	super(null,price);
    	this.eMail=eMail;
    }
    
    
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
	@Override
	public void takePicture() {
		// TODO Auto-generated method stub
		System.out.println("Picture is taken");
	}

	@Override
	public void takeVideo() {
		// TODO Auto-generated method stub
		System.out.println("Video is best ");
	}
	@Override
	public void portable() {
		// TODO Auto-generated method stub
		System.out.println("On Lap");
		
	}
	@Override
	public String toString() {
		this.takePicture();
		this.takeVideo();
		this.portable();
		return "Laptop [eMail=" + eMail + "]";
	}
	

}
