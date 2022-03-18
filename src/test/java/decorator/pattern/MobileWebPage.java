package decorator.pattern;

public class MobileWebPage implements WebPage {
	
	@Override
    public String createWebPage(){
        return "Mobile WebPage is created";
    }

	@Override
	public int rank() {
		return 1;
	}

}
