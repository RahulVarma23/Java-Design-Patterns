package decorator1.pattern;

public class DesktopVersionDecorator implements WebPage {

	WebPage webpage;
	
	public DesktopVersionDecorator(WebPage webpage) {
		this.webpage=webpage;
	}
	
	public String addWidget() {
		return webpage.addWidget()+ " and add header as well";
	}

	@Override
	public int rank() {
		return webpage.rank()+1;
	}
}
