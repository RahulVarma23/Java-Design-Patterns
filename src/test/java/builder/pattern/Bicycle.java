package builder.pattern;

public class Bicycle {
	
	//gears, double stands, double seats, carrier
	private boolean gears;
	private boolean doubleStand;
	private boolean doubleSeats;
	private boolean carrier;
	
	public Bicycle(BicycleBuilder bicycleBuilder) {
		this.gears=bicycleBuilder.isGears;
		this.doubleStand=bicycleBuilder.isDoubleStand;
		this.doubleSeats=bicycleBuilder.isDoubleSeats;
		this.carrier=bicycleBuilder.isCarrier;	
	}

	 @Override
	    public String toString() {
	        return "Bicycle-> "+"gears:" +this.gears+", "+"doubleStand:"+this.doubleStand+", "+"doubleSeats:"+this.doubleSeats+", "+"carrier:"+this.carrier;
	    }

	public static class BicycleBuilder {
		private boolean isGears;
		private boolean isDoubleStand;
		private boolean isDoubleSeats;
		private boolean isCarrier; 
		
		public BicycleBuilder isGears(boolean isGears) {
            this.isGears = isGears;
            return this;
        }
		
		public BicycleBuilder isDoubleStand(boolean isDoubleStand) {
            this.isDoubleStand = isDoubleStand;
            return this;
        }
		
		public BicycleBuilder isDoubleSeats(boolean isDoubleSeats) {
            this.isDoubleSeats = isDoubleSeats;
            return this;
        }
		
		public BicycleBuilder isCarrier(boolean isCarrier) {
            this.isCarrier = isCarrier;
            return this;
        }
		
		//Return the finally constructed User object
        public Bicycle build() {	
            return new Bicycle(this);
        }  
	}
}
