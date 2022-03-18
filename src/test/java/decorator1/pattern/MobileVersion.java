package decorator1.pattern;

public class MobileVersion implements WebPage {

	@Override
	public String addWidget() {
		
		return "add sidebar in mobile version";
	}

	@Override
	public int rank() {
		// TODO Auto-generated method stub
		return 2;
	}

}
