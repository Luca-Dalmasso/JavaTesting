import function.EatFunction;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EatFunction t = new EatFunction();
		
		System.out.println(t.acceptableToEat(-10, 100,  100));
		
		System.out.println(t.acceptableToEat(100, 100, 100));
		
		System.out.println(t.acceptableToEat(2, 3, 15));
		
		System.out.println(t.acceptableToEat(1, 1, 10));
		
		System.out.println(t.acceptableToEat(1, 1, 1));

	}

}
