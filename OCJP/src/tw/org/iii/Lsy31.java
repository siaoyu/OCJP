package tw.org.iii;

public class Lsy31 {

	public static void main(String[] args) {
//		String s1 = "Lsy";
//		String s2 = s1;
//		System.out.println(s1);
//		System.out.println(s1 == s2);
//		s1 = "Mary";
//		System.out.println(s1 == s2);
//		String s3 = "Lsy";
//		System.out.println(s3.concat("1234567"));
//		System.out.println(s3.replace('s', 'S'));
//		System.out.println(s3);
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = sb1;
		sb1.append("1234567890123456789");
		System.out.println("capacity:"+sb1.capacity());
		System.out.println("length:"+sb1.length());
		System.out.println(sb1 == sb2);
	}

}