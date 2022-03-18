package decorator1.pattern;

public class Demo {
	
	public static void main(String[] args) {
		//WebPage mobile= new MobileVersion();
		WebPage webPage = new MobileVersionDecorator(new MobileVersion());
		System.out.println(webPage.addWidget()+" ,Rank:" +webPage.rank());
		
		WebPage webPage1 = new MobileVersionDecorator(new DesktopVersion());
		System.out.println(webPage1.addWidget()+" ,Rank:" +webPage1.rank());
		
		WebPage webPage2 = new DesktopVersionDecorator(new DesktopVersion());
		System.out.println(webPage2.addWidget()+" ,Rank:" +webPage2.rank());
		
		WebPage webPage3 = new DesktopVersionDecorator(new MobileVersion());
		System.out.println(webPage3.addWidget()+" ,Rank:" +webPage3.rank());
	}
}
