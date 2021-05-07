package function;

public class EatFunction {
		public boolean acceptableToEat (Integer carbo, Integer proteins, Integer fats) {
			Integer calories = carbo*4 + proteins*4 +fats*9;
			if ((calories<1000)&&((carbo + proteins) / fats > 0.5)) { return true; }
			return false;
		}
}
