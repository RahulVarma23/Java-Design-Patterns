package decorator.pattern;

public class ClockWidget extends WebPageDecorator{
	private final String ADD_CLOCK_WIDGET = " and Clock Widget is added";
	private final int clockWidgetRank = 5;

	public ClockWidget(WebPage webPage) {
		super(webPage);
	}

	@Override
	public String createWebPage() {
		return webPage.createWebPage() + ADD_CLOCK_WIDGET;
	}
	
	public int rank() {
		return webPage.rank()+clockWidgetRank;
	}

}