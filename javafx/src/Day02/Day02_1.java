package Day02;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day02_1 extends Application{

	
	@Override
	public void start(Stage stage) throws Exception {
		
		
		//6. 씬빌더 파일 가져오기
		//1. 
		Parent parent = FXMLLoader.load(getClass().getResource("test1.fxml"));
														
		//Parent parent = FXMLLoader.load(getClass().getResource("")); //fxml 이 동일한 패키지명에있을경우
		//씬넣기
		Scene scene = new Scene(parent);
		// 3. 스테이지에 씬넣기
		stage.setScene(scene);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
