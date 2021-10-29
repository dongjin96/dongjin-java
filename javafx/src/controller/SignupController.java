package controller;


	import dao.MemberDao;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
	import javafx.scene.layout.AnchorPane;

	public class SignupController {
	    @FXML
	    private Label btnback;

	    @FXML
	    private Button btnsignup;

	    @FXML
	    private Label lblconfirm;

	    @FXML
	    private AnchorPane signuppane;

	    @FXML
	    private PasswordField txtemail;

	    @FXML
	    private TextField txtid;

	    @FXML
	    private PasswordField txtname;

	    @FXML
	    private PasswordField txtpassword;

	    @FXML
	    private PasswordField txtpasswordconfirm;

	   

	    @FXML
	    void signup(ActionEvent event) {
	    	
	    	//0. ��Ʈ�� ��ü ȣ���=> fx:id ȣ��
	    	
	    	//1. ��ȿ���˻�
	    	//1. ���̵� ���� üũ
	    	if(txtid.getText().length()<4 || txtid.getText().length()>13) {// ��ü�����ִ°� �����Դµ� �װ��� ���� �� �纸�� ũ�� 
	    		lblconfirm.setText("���̵�� 4~12�����̻�");
	    		return;
	    	}
	    	//2. �н����� ����üũ
	    	if(txtpassword.getText().length()<4 || txtpassword.getText().length()>9) {
	    		lblconfirm.setText("��й�ȣ�� 4~8���ڷθ� �����մϴ�");
	    		return;
	    	}
	    	//2. �ߺ�üũ
	    	if( !txtpassword.getText().equals( txtpasswordconfirm.getText() ) ){
	    		// ! : ���� [ �ݴ� ] 
	    		lblconfirm.setText("��й�ȣ �� �������� �ʽ��ϴ�. "); // ���̺� ���� ����
	    		return; // �޼ҵ� �� 	
	    	}
	    	//4. �̸����� üũ
	    	if(txtname.getText().length()<2) {
	    		lblconfirm.setText("�̸��� 2���� �̻����θ� �����մϴ�");return;
	    	}
	    	//5. �̸��� ���� üũ
	    	if(txtemail.getText().length()<5 && !txtemail.getText().contains("@")) {}
	    	//3. ��üȭ
	    	
	    	Member member = new Member(txtid.getText(),txtpassword.getText() , txtname.getText(), txtemail.getText());
	    	//4. ����Ȥ��DBó��
	    	boolean result =  MemberDao.getMemberDao().signup(member);
	    	if(result) { // DB������
	    		lblconfirm.setText("�������ּż� �����մϴ�");
	    	
		    	Alert alert = new Alert(AlertType.INFORMATION);//1. �޽��� ��ü ����
		    	alert.setContentText("Nike community ������ �����մϴ�[����Ʈ 1000����]");
		    	alert.setHeaderText("ȸ�����Լ���");// 3. �޽��� ����
		    	alert.setTitle("�˸�");
		    	alert.showAndWait();//4. �޽��� ���� ��ư �Է½� ���� ���\
		    	LoginController.getinstance().loadpage("nikelogin"); 
		    }else { //DB���н�
		    	lblconfirm.setText("�����ڸ� ȣ�����ּ���");   
		    	
		    }
	    }
	
	    @FXML
	    void back(MouseEvent event) {
	    	
	    	// !! ���ο� ��ü ����ÿ��� ���ο� �޸�
	    	//LoginController loginController= new LoginController()
	    	// ������ �޸� ����ϱ� ���ؼ�  this Ű���带 ����� ��ü ȣ��
	    	LoginController.getController().loadpage("nikelogin");
	    }
	}

	
	

