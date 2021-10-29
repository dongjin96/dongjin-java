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
	    	
	    	//0. 컨트롤 객체 호출시=> fx:id 호출
	    	
	    	//1. 유효성검사
	    	//1. 아이디 길이 체크
	    	if(txtid.getText().length()<4 || txtid.getText().length()>13) {// 객체ㅇ에있는걸 가져왔는데 그것이 길이 가 사보다 크고 
	    		lblconfirm.setText("아이디는 4~12글자이상");
	    		return;
	    	}
	    	//2. 패스워드 길이체크
	    	if(txtpassword.getText().length()<4 || txtpassword.getText().length()>9) {
	    		lblconfirm.setText("비밀번호는 4~8글자로만 가능합니다");
	    		return;
	    	}
	    	//2. 중복체크
	    	if( !txtpassword.getText().equals( txtpasswordconfirm.getText() ) ){
	    		// ! : 부정 [ 반대 ] 
	    		lblconfirm.setText("비밀번호 가 동일하지 않습니다. "); // 레이블 내용 변경
	    		return; // 메소드 끝 	
	    	}
	    	//4. 이름길이 체크
	    	if(txtname.getText().length()<2) {
	    		lblconfirm.setText("이름은 2글자 이상으로만 가능합니다");return;
	    	}
	    	//5. 이메일 길이 체크
	    	if(txtemail.getText().length()<5 && !txtemail.getText().contains("@")) {}
	    	//3. 객체화
	    	
	    	Member member = new Member(txtid.getText(),txtpassword.getText() , txtname.getText(), txtemail.getText());
	    	//4. 파일혹은DB처리
	    	boolean result =  MemberDao.getMemberDao().signup(member);
	    	if(result) { // DB성공시
	    		lblconfirm.setText("가입해주셔서 갑사합니다");
	    	
		    	Alert alert = new Alert(AlertType.INFORMATION);//1. 메시지 객체 생성
		    	alert.setContentText("Nike community 가입을 축하합니다[포인트 1000지급]");
		    	alert.setHeaderText("회원가입성공");// 3. 메시지 제목
		    	alert.setTitle("알림");
		    	alert.showAndWait();//4. 메시지 띄우고 버튼 입력시 까지 대기\
		    	LoginController.getinstance().loadpage("nikelogin"); 
		    }else { //DB실패시
		    	lblconfirm.setText("관리자를 호출해주세요");   
		    	
		    }
	    }
	
	    @FXML
	    void back(MouseEvent event) {
	    	
	    	// !! 새로운 객체 선언시에는 새로운 메모리
	    	//LoginController loginController= new LoginController()
	    	// 동일한 메모리 사용하기 위해서  this 키워드를 사용한 객체 호출
	    	LoginController.getController().loadpage("nikelogin");
	    }
	}

	
	

