package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class LoginController implements Initializable{
										//�ʱ�ȭ ���õ� �޼ҵ�����
	// ����Ŭ������ ��üȭ[Ŭ���� ��ü�� ��ü]
			//1. static ���� ����
	private static LoginController instance;
	
	
	public LoginController() {
		//2. ����Ŭ������ �޸� ȣ�� = this
		instance= this;// [����Ŭ������ ��� ����]
	}
	// fxml ����� �ʱⰪ ���� �޼ҵ�
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
			
	}
	
	
	
	public static LoginController getController() {
		return instance;
	}

	// �ʵ�
		// ��Ʈ�� �ʵ� ����
	@FXML
    private Label btnfindid;

    @FXML
    private Label btnfindpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Label btnsignup;

    @FXML
    private Label lblconfirm;

    @FXML
    private AnchorPane loginpane;

    @FXML
    private BorderPane mainboardpane;

    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    void findid(MouseEvent event) {

    }

    @FXML
    void findpassword(MouseEvent event) {

    }

    @FXML
    void login(ActionEvent event) {
       // txt �Էµ� ���̵�� �н����� ȸ���� �����ϸ� �α��μ���
    	if (txtid.getText().equals("admin")&&  
    			txtpassword.getText().equals("1234")) {
    		//���̵�� �н����尡 �����ϸ� ����
    		lblconfirm.setText("�α��μ���");
			
		}else {
			lblconfirm.setText("�α��ν��� �Է¹��������������ϴ�");
		}
    	//�ƴϸ� ����
    }
   
    
    @FXML
    void signup(MouseEvent event) {
    
       loadpage("nikesignup");
    }
    
    
    
	//boarderpane center ����
	public void loadpage(String page) {
		try {
			lblconfirm.setText(""); //���޼����� �������� ����
			
		
		Parent parent = FXMLLoader.load(getClass().getResource("/fxml/"+page+".fxml"));
			mainboardpane.setCenter(parent);
	
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
		
	
	
	
	
	
	
}
