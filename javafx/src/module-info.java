module javafx {
	requires javafx.controls;
	requires javafx.fxml;
	
	
	opens app to javafx.graphics, javafx.fxml;
	opens controller to javafx.graphics, javafx.fxml;
}
