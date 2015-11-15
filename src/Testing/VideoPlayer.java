package Testing;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class VideoPlayer extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		WebView webview = new WebView();
		webview.getEngine().load("https://www.youtube.com/watch?v=PY0LL_-jqa0");
		webview.setPrefSize(640, 390);

		stage.setScene(new Scene(webview));
		stage.show();
	}
	
	public static void main(String [] args){
		launch(args);
	}
}
