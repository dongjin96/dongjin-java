module javafx {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires mail;
	requires activation;
	
	
	opens app to javafx.graphics, javafx.fxml;
	opens controller to javafx.graphics, javafx.fxml;
	opens Day02 to javafx.graphics,javafx.fxml;
	opens dao to java.sql;
	opens domain to mail, activation;

}
