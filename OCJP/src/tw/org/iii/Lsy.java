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
