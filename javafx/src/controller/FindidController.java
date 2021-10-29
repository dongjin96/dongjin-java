package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class FindidController implements Initializable {
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
		
	}

	
	
	
	
	 @FXML
	    private Label btnback;

	    @FXML
	    private Button btnfindid;

	    @FXML
	    private AnchorPane findidpane;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    private AnchorPane signuppane;

	    @FXML
	    private PasswordField txtemail;

	    @FXML
	    private PasswordField txtname;

    @FXML
    void back(MouseEvent event) {
     LoginController.getinstance().loadpage("nikelogin");
    }

    @FXML
    void findid(ActionEvent event) {
    	// 1. Dao ��ü�� findid �޼ҵ� ȣ�� 
    	String result =   MemberDao.getMemberDao()
    		.findid( txtname.getText() , txtemail.getText() );
    	
    	if( result != null ) {
    		lblconfirm.setText("ȸ���� ���̵� : " + result );
    	}else {
    		lblconfirm.setText("��ġ�ϴ� ���̵� �������� �ʽ��ϴ�");
    	}
    }

	
}


