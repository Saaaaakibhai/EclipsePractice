public class Main {
	public static void main(String[] args) {
		//10 digit id 
        int id = 2112370642;
        int count = 0;
        int x = 0;
        //Getting side (x)       
        while(id != 0){
            count++;
            int temp = id % 10;
            if(count == 6){
            	// A>T>Q if 5th digit=0 the x=10
                if(temp == 0){
                    x = 10;
                }else{
                	//or it will take the 5th digit 
                    x = temp;
                }
                break;
            }
            id = id / 10;
        }
        //hep - heptagon 
        
        Heptagon hep = new Heptagon(x);
        System.out.println(hep.getArea());
        System.out.println(hep.getPerimeter());

    }
}
