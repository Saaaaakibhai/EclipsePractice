package ClassWork;
class ClassDemo {

	public static void main(String[] args) {
		int sum = 0;       
		for (int i = 1; i <10; i++)
		{
			sum +=  i;
		}		
		double avg = sum / 10;
        System.out.println("Sum= "+sum);
        System.out.println("Avarage= "+avg);
	}
}
