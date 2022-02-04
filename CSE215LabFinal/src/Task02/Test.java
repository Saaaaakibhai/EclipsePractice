package Task02;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        //2112370642
        // x = 3
        Vehicle[] arr = new Vehicle[3];

        try{
            arr[0] = new Car("Blue",1000,"Demo121");
            arr[1] = new Cycle("Black",2000,"Alpha007");
            arr[2] = new Car("Red",3000,"ByteXO");
        }catch (InputWrongException ex){
            System.out.println(ex);
        }

        try {
            FileWriter file = new FileWriter("output.txt");
            for (int i = 0; i < arr.length; i++) {
                file.write(arr[i].toString());
                file.write("\n");
            }
            file.write(""+arr[0].equals(arr[1])+"\n");
            file.write(""+arr[0].equals(arr[2]));
            file.close();
            System.out.println("data wiritten in output.txt file");
        }catch(IOException ex) {
            System.out.println(ex);
        }
    }
}
