/* 老師的github
 * https://github.com/bradchao/MyJava03.git
 * https://github.com/bradchao/Java2003.git
 */


package tw.org.iii;

public class Lsy {
	int a;
	static int b;
	{
		a++;
		System.out.println("{}:a="+a);
	}
	
	static{
		System.out.println("static{}");
	}
	
	Lsy(){
		System.out.println("Lsy()");
	}
}
