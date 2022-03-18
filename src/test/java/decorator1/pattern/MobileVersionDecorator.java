package decorator1.pattern;

public class MobileVersionDecorator implements WebPage{
	
   WebPage webpage;
	
	public MobileVersionDecorator(WebPage webpage) {
		this.webpage=webpage;
	}
	
	public String addWidget() {
		return webpage.addWidget()+" and add footer as well";
	}

	@Override
	public int rank() {
		return webpage.rank()+2;
	}

}
