package decorator.pattern;

public class Demo {

	public static void main(String[] args) {
		
		WebPage webPage1 = new CalendarWidget(new MobileWebPage());
        System.out.println( webPage1.createWebPage() + " ,Rank Of webapage:" + webPage1.rank());

        WebPage webPage2 = new ClockWidget(new DesktopWebPage());
        System.out.println(webPage2.createWebPage()+ " ,Rank Of webapage:" +webPage2.rank());


	}

}
