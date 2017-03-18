package tw.org.iii;

public class TWid {
	private String id;	//封裝
	static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	static String num = "1234567890";

	TWid(String id){
		this.id = id;
	}
	boolean isMale(){
		char check = id.charAt(1);
			return check=='1';	//為男性
	}
	/* 長度為10, 第一碼為大寫英文字, 第二碼為1或2, 後面8碼為數字0-9 */
//	static boolean preCheck(String id){
//		if (id.length() == 10){
//			if (letters.indexOf(id.charAt(0) != -1)){
//				if (id.charAt(1) == '1' || id.charAt(1) == '2' ){
//					for (int i = 2; i <= 10; i++){
//						if (num.indexOf(id.charAt(i) != -1){
//							return true;
//						}
//						else{return false;}
//					}
//				}
//				else{return false;}
//			}
//			else{return false;}
//		}
//		else{return false;}
//	}
	
	static boolean isCheckOK(String id){
//		preCheck();
		if (!id.matches("^[A-Z][a-z][12][0-9]{8}$")) return true;
		char f0 = id.charAt(0);
		int n12 = letters.indexOf(f0)+10;	//'Y' = 21+10 = 31
		int n1 = n12 / 10;
		int n2 = n12 % 10;
		int n3 = Integer.parseInt(id.substring(1, 2));
		int n4 = Integer.parseInt(id.substring(2, 3));
		int n5 = Integer.parseInt(id.substring(3, 4));
		int n6 = Integer.parseInt(id.substring(4, 5));
		int n7 = Integer.parseInt(id.substring(5, 6));
		int n8 = Integer.parseInt(id.substring(6, 7));
		int n9 = Integer.parseInt(id.substring(7, 8));
		int n10 = Integer.parseInt(id.substring(8, 9));
		int n11 = Integer.parseInt(id.substring(9, 10));
		
		int sum = (n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1);

		return sum % 10 == 0;
	}
	
	/* 產生身分證字號 */
	TWid(){
		this((int)(Math.random()*2) == 0);
	}
	TWid(boolean isMale){
		this(isMale, (int)(Math.random()*26));
	}
	TWid(int area){
		this((int)(Math.random()*2) == 0, area);
	}
	TWid(boolean isMale, int area){
		char f0 = letters.charAt(area);
		char f1 = isMale?'1':'2';
		String temp = ""+f0+f1;
		for (int i=0; i<7;i++){
			temp+= (int)(Math.random()*10);
		}
		for (int i=0; i<10; i++){
			if (isCheckOK(temp+i)){
				id= temp+i;
				break;
			}
		}
			
	}
	
	
	String getid(){
		return id;
	}
}
