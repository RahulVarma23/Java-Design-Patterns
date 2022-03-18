package decorator.pattern;

public class CalendarWidget extends WebPageDecorator {

	private final String ADD_CALENDAR_WIDGET = " and Calendar Widget is added";
	private final int calendarWidgetRank = 10;

	public CalendarWidget(WebPage webPage) {
		super(webPage);
	}

	@Override
	public String createWebPage() {
		return webPage.createWebPage() + ADD_CALENDAR_WIDGET;
	}
	
	public int rank() {
		return webPage.rank()+calendarWidgetRank;
	}
}
