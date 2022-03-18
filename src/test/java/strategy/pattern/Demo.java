package strategy.pattern;

public class Demo {

	public static void main(String[] args) {
		CameraAppContext context1 = new CameraAppContext(new BasicCameraApp());          
        context1.share("text");

        CameraAppContext context2 = new CameraAppContext(new CameraPlusApp());          
        context2.share("share it app");

	}

}
