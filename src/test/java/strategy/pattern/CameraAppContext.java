package strategy.pattern;

public class CameraAppContext {
	
	private PhoneCameraApp phoneCameraApp;

	
	public CameraAppContext(PhoneCameraApp phoneCameraApp){  
        this.phoneCameraApp = phoneCameraApp;  
     }  

     public void share(String medium){  
         phoneCameraApp.sharePhoto(medium);
     }  
}
