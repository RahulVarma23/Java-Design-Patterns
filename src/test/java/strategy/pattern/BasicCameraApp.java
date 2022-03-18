package strategy.pattern;

public class BasicCameraApp implements PhoneCameraApp {

	@Override
	public void editPhoto() {
		System.out.println("edit photo in BasicCameraApp");
	}

}
