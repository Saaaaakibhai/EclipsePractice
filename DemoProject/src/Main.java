import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File hfile = new File("hospital.txt");
        File dfile = new File("diagnosticCenter.txt");
        // write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<CoronaDay> coronaDays = new ArrayList<>();

        while (true) {
            display();
            int n = input.nextInt();
            if (n == 1) {
                System.out.print("enter username: ");
                String username = input.next();
                System.out.print("enter password: ");
                String pass = input.next();

                if (username.equals("sakib") && pass.equals("ki")) {
                    System.out.println("successfully log in");
                }
            }

            if (n == 2) {
                CoronaDay coronaDay = new CoronaDay();
                DiagnosticCenter diagnosticCenter = new DiagnosticCenter();
                System.out.print("Username: ");
                diagnosticCenter.setUserName(input.next());
                System.out.print("Pass: ");
                diagnosticCenter.setPassword(input.next());
                System.out.print("Address:");
                diagnosticCenter.setAddress(input.next());
                System.out.print("Division:(int) ");
                diagnosticCenter.setDivision(input.nextInt());
                System.out.print("Phn: ");
                diagnosticCenter.setPhnNo(input.next());
                System.out.print("Enter date: ");
                coronaDay.setCalendar(input.nextInt(), input.nextInt(), input.nextInt());

            }
        }

    }

    public static void display() {
        System.out.println("1. log in: ");
        System.out.println("2. Add/ Registration");
        System.out.println();
        System.out.println("choose any: ");
    }

    public static void addingHospitalFile(File file, ArrayList<Hospital> hospitalArrayList) throws FileNotFoundException {
        Writer out;
        PrintWriter printWriter = new PrintWriter(file);
        for (int i = 0; i < hospitalArrayList.size(); i++) {
            printWriter.println(hospitalArrayList.get(i).getUserName());
            printWriter.println(hospitalArrayList.get(i).getPassword());
            printWriter.println(hospitalArrayList.get(i).getName());
            printWriter.println(hospitalArrayList.get(i).getAddress());
            printWriter.println(hospitalArrayList.get(i).getDivision());
            printWriter.println(hospitalArrayList.get(i).getPhnNo());
            printWriter.println(hospitalArrayList.get(i).getCategory());
            printWriter.println(hospitalArrayList.get(i).getCoronaInfo());
            printWriter.println(hospitalArrayList.get(i).getTestFee());
            printWriter.println(hospitalArrayList.get(i).getActiveHour());
            printWriter.println(hospitalArrayList.get(i).getTotalGenralBed());
            printWriter.println(hospitalArrayList.get(i).getEngagedGeneralBed());
            printWriter.println(hospitalArrayList.get(i).getTotalIcu());
            printWriter.println(hospitalArrayList.get(i).getEngagedIcu());

        }

        printWriter.close();


    }

    public static void addingDiagnosticCenterFile(File file, ArrayList<DiagnosticCenter> diagnosticCenterArrayList) throws FileNotFoundException {
        Writer out;
        PrintWriter printWriter = new PrintWriter(file);

        for (int i = 0; i < diagnosticCenterArrayList.size(); i++) {
            printWriter.println(diagnosticCenterArrayList.get(i).getUserName());
            printWriter.println(diagnosticCenterArrayList.get(i).getPassword());
            printWriter.println(diagnosticCenterArrayList.get(i).getName());
            printWriter.println(diagnosticCenterArrayList.get(i).getAddress());
            printWriter.println(diagnosticCenterArrayList.get(i).getDivision());
            printWriter.println(diagnosticCenterArrayList.get(i).getPhnNo());
            printWriter.println(diagnosticCenterArrayList.get(i).getTestFee());
            printWriter.println(diagnosticCenterArrayList.get(i).getActiveHour());
        }
    }
}