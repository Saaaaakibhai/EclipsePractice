package Class20_02;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Chat chat = new Chat();
		new person1(chat).start();
		new person2(chat).start();
		new person3(chat).start();
	}
}

class Chat {

	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	Scanner sc3 = new Scanner(System.in);
	String str1, str2, str3;
	int flag = 0;

	public synchronized void getTalk1() throws InterruptedException {
		if (flag == 1) {
			wait();
		}
		System.out.print("Person1: ");
		str1 = sc1.nextLine();
		if (str1.equalsIgnoreCase("STOP")) {
			System.out.println("Person1 has left the chat.\n");
			
			if(person2.isSTOP() || person3.isSTOP()) {
				System.out.println("Conversation End.");
				System.exit(0);
			}
			else
				person1.STOP();
		}
		flag = 1;
		notifyAll();
	}

	public synchronized void getTalk2() throws InterruptedException {
		if (flag == 0) {
			wait();
		}
		
		System.out.print("Person2: ");
		str2 = sc2.nextLine();
		if (str2.equalsIgnoreCase("STOP")) {
			System.out.println("Person2 has left the chat.\n");
			
			if(person1.isSTOP() || person3.isSTOP()) {
				System.out.println("Conversation End.");
				System.exit(0);
			}
			else
				person2.STOP();
		}

		flag = 0;
		notifyAll();
	}

	public synchronized void getTalk3() throws InterruptedException {
		if (flag == 3) {
			wait();
		}
		System.out.print("Person3: ");
		str3 = sc3.nextLine();
		if (str3.equalsIgnoreCase("STOP")) {
			System.out.println("Person3 has left the chat.\n");
			
			if(person1.isSTOP() || person2.isSTOP()) {
				System.out.println("\nThank you for using my chatting app!\nDeveloped by Faiz.");
				System.exit(0);
			}
			else
				person3.STOP();
		}

		flag = 3;
		notifyAll();
	}

}

class person1 extends Thread {

	Chat chat;
	static boolean exit = false;

	public person1(Chat chat) {
		this.chat = chat;
	}

	public void run() {
		try {
			while (!exit) {
				chat.getTalk1();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void STOP() {
		exit = true;
	}
	
	public static boolean isSTOP() {
		return exit;
	}
}

class person2 extends Thread {

	Chat chat;
	static boolean exit = false;

	public person2(Chat chat) {
		this.chat = chat;
	}

	public void run() {
		try {
			while (!exit) {
				chat.getTalk2();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void STOP() {
		exit = true;
	}
	
	public static boolean isSTOP() {
		return exit;
	}
}

class person3 extends Thread {

	Chat chat;
	static boolean exit = false;

	public person3(Chat chat) {
		this.chat = chat;
	}

	public void run() {
		try {
			while (!exit) {
				chat.getTalk3();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void STOP() {
		exit = true;
	}
	
	public static boolean isSTOP() {
		return exit;
	}
}