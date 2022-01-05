package Task01;

public class RoboGrid {
	public static final int MX = 100;
	public static final int MY = 100;
	private int cur_x;
	private int cur_y;
	private String name;

	public RoboGrid() {
		this.cur_x = 0;
		this.cur_y = 0;
		this.name = "Nimo";
	}

	public RoboGrid(String name, int x, int y) {
		this.cur_x = x;
		this.cur_y = y;
		this.name = name;
	}

	public boolean moveUP(int z) {
		if (this.cur_y + z > MY || this.cur_y + z < 0)
			return false;
		else {
			this.cur_y += z;
			return true;
		}
	}

	public boolean moveRight(int z) {
		if (this.cur_x + z > MX || this.cur_x + z < 0)
			return false;
		else {
			this.cur_x += z;
			return true;
		}
	}
	
	//Overloaded method
	public boolean moveRight() {
		if (this.cur_x > MX || this.cur_x < 0)
			return false;
		else {
			this.cur_x ++;
			return true;
		}
	}

	public boolean setPos(int x, int y) {
		if (x > 100 || y > 100 || x < 0 || y < 0)
			return false;
		else {
			this.cur_x = x;
			this.cur_y = y;
			return true;
		}
	}

	public int getPosX() {
		return this.cur_x;
	}

	public int getPosY() {
		return this.cur_y;
	}

	public String toString() {
		return "The robot-" + this.name + " is ar (" + this.getPosX() + "," + this.getPosY() + ")";
	}

	public static void main(String[] args) {
		
		RoboGrid r1 = new RoboGrid("Melissa",15,40);
		RoboGrid r2 = new RoboGrid("Bob",44,20);
		
		r1.moveRight(7);
		r2.moveUP(11);
		System.out.println(r1.toString());
		System.out.println(r2.toString());

	}

}
