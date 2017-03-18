package tw.org.iii;

public class LsyTWid {
	public static void main(String[] args) {
//		System.out.println(TWid.isCheckOK(""));
		
		
		TWid id1 = new TWid("A223456789");
		System.out.println(id1.getid());
		if (id1.isMale()){
			System.out.println("male");
		}
		else{
			System.out.println("female");
		}
			
	}
}
