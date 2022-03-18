package decorator1.pattern;

public class DesktopVersion implements WebPage{
	
	@Override
	public String addWidget() {	
		return "add sidebar in desktop version";
	}

	@Override
	public int rank() {
		return 1;
	}


}
