package strategy.pattern;

public interface PhoneCameraApp {
	
	void editPhoto();
	
    default void takePhoto() {
    	System.out.println("take photo");
	}
    
	default void savePhoto() {
		System.out.println("save photo");
	}
	
	default void sharePhoto(String medium) {
		System.out.println("share photo by "+medium);
	}

}
