package Class09;

public class Remote {
	public static void main(String[]args)
	{
		//Creating an object of TV Class
		TV tv=new TV();
		tv.turnOn();//default output 1,20
		//getting pure information
		tv.setChannel(35);
		tv.setVolume(50);
        tv.info();
        //getting 2nd information
        tv.turnOff();
        tv.info();
	}
}
