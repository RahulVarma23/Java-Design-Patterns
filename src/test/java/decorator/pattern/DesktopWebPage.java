package decorator.pattern;

public class DesktopWebPage implements WebPage {
	
	 @Override
	    public String createWebPage(){
	        return "Desktop WebPage is created";
	    }

	@Override
	public int rank() {
		return 2;
	}


}
