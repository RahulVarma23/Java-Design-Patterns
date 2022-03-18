package decorator.pattern;

public class WebPageDecorator implements WebPage{
	
	WebPage webPage;
	
	public WebPageDecorator(WebPage webPage) {
		this.webPage=webPage;
	}

	@Override
	public String createWebPage() {
		return webPage.createWebPage();
	}

	@Override
	public int rank() {
		return webPage.rank();
	}
	
	
	
	

}
