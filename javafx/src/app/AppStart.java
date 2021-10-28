package app;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AppStart extends Application {
   
   @Override
   public void start(Stage stage) throws Exception {
      Parent parent = FXMLLoader.load(getClass().getResource("/fxml/nikelogin.fxml"));
      
      Scene scene = new Scene(parent);
      stage.setScene(scene);
         stage.setResizable(false); // �������� ũ�Ⱚ ����
         stage.setTitle("Nike"); // �������� �̸�
         // �������� ������
            // 1. �̹��� �ҷ�����
         Image image = new Image("D:\\console_1\\javafx\\src\\fxml\\����Ű �ΰ�.jpg");
         stage.getIcons().add(image);
      stage.show();
      
      
   }
   
   public static void main(String[] args) {
      launch(args);
   }

}