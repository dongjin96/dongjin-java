# dongjin-java

11/4 과제
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		int[][] 제품리스트 = new int[3][3];

			
			// 재고 
			제품리스트[0][0] = 10; //콜라
			제품리스트[1][0] = 10;	//사이
			제품리스트[2][0] = 10;	//환타
			// 구매수 
			제품리스트[0][1] = 0;
			제품리스트[1][1] = 0;
			제품리스트[2][1] = 0;
			// 가격
			제품리스트[0][2] = 300;
			제품리스트[1][2] = 200;
			제품리스트[2][2] = 100;
		
		
			while (true) {
				System.out.println("-------------------- 메뉴 ------------------- ");
				System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
				System.out.print(">>>>>> 선택 : ");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					if (제품리스트[0][0]==0) {
						System.out.println("콜라가 매진되었습니다");
						
					}else {System.out.println("콜라 구매 성공");
						제품리스트[0][0]--;
						제품리스트[0][1]++;
						
					}
					
				}
				if(ch==2) {
					if (제품리스트[1][0]==0) {
						System.out.println("사이다가 매진되었습니다");
						
					}else {System.out.println("사이다 구매 성공");
						제품리스트[1][0]--;
						제품리스트[1][1]++;
						
					}
					
				}
				if(ch==3) {
					if (제품리스트[2][0]==0) {
						System.out.println("환타가 매진되었습니다");
						
					}else {System.out.println("환타 구매 성공");
						제품리스트[2][0]--;
						제품리스트[2][1]++;
						
					}
					
				}
				System.out.println("=========장바구니========");
				System.out.println("제품명\t제품수량\t결제액");
				if (제품리스트[0][1]  > 0) {
				System.out.println("콜라\t" + 제품리스트[0][1] + "\t" + 제품리스트[0][1]* 제품리스트[0][2]);
				}
				
				
			}
	}
}

-----------------------------------------------------------------------------------------------------------------------
//회원제
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] 회원정보 = new String[100][2];
		 String[][]방문록 =new String[100][2];//제목 이름만받음

		while (true) {
			System.out.println("====================회원제방문록================");
			System.out.println("1.회원가입 2. 로그인>>>>>[선택]:");
			int ch = scanner.nextInt();

			if (ch == 1) {
				System.out.println("-----------회원가입--------");
				System.out.println("ID 를입력해주세요 :");
				String id = scanner.next();
				System.out.println("PW 를입력해주세요:");
				String pw = scanner.next();

				boolean check = true;
				for (int i = 0; i < 회원정보.length; i++) {
					if (회원정보[i][0] != null && 회원정보[i][0].equals(id)) {
						System.out.println("동일한 아이디가 존재합니다");
						check = false;
						break;

					} // ife
				} // fore
			if (check) {
				for (int i = 0; i < 회원정보.length; i++) {
					if (회원정보[i][0]==null) {
						회원정보[i][0] = id;
						회원정보[i][1] = pw;
						System.out.println("저장이완료되었습니다");// 넣기
						check = true;
						break;
					}
				}

			}
		}

		if (ch == 2) {
			System.out.println("======로그인======");
			System.out.println("ID를 입력하세요>>>:");
			String id2 = scanner.next();
			System.out.println("PW를 입력하세요>>>:");
			String pw2 = scanner.next();

			boolean logincheck = true;
			for (int i = 0; i < 회원정보.length; i++) {
				if (회원정보[i][0] != null && 회원정보[i][0].equals(id2) && 회원정보[i][1].equals(pw2)) {
					System.out.println("[[ 알림 ]] : 로그인 성공 ");

				}
				
				
				while(true) {
					System.out.println("\n\n\t - 회원 메뉴 - ");
					System.out.print(" [[ 1.방문록 쓰기 2.방문록 확인 3.로그아웃  선택 : ");int ch2 = scanner.nextInt();
					
					if(ch2==1) {
						System.out.println("==========방문록작성==========");
						System.out.println("제목:");String title = scanner.next();
						System.out.println("작성자:");String writer = scanner.next();
						for (int j = 0; j < 방문록.length; j++) {
						if (방문록[j][0]==null) {
							방문록[j][0]=title;방문록[j][1]=writer;
						}	
						}
					}break;
					if(ch2==2) {
						System.out.println("==========방문록==========");
						System.out.print("%10s \t %4S\t", "제목", "작성자");
							for (int j = 0; j < 방문록.length; j++) {
								if (방문록[j][0]==null) { break; }
									System.out.printf("%10s \t %4S\t ",방문록[j][0],방문록[j][1]);					                         //System.out.println("제목:"+(방문록["j"][0]));
									
								
							}
						
					}
					
				
				
				
				
				
			}
		} // 
