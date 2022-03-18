package builder.pattern;


public class TestBuilderPattern {

	public static void main(String[] args) {
		//with gears and double stand
		Bicycle bicycle1 = new Bicycle.BicycleBuilder().isGears(true).isDoubleStand(true).build();
		System.out.println(bicycle1);
		
		//with gears and double seat 
		Bicycle bicycle2 = new Bicycle.BicycleBuilder().isDoubleSeats(true).isCarrier(true).build();	
		System.out.println(bicycle2);	
	}
}
