package tw.org.iii;

public class Lsy20170317 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 統計骰子各點次數 */
//		int dice = (int)(Math.random()*6+1);
//		System.out.println(dice);
		
		int[] num = new int[6];	//0~5
//		System.out.println(num.length);
		
		int inputnum = 1;
		while (inputnum <= 6){
			int dice = (int)(Math.random()*6);	//0~5
			num[dice]++;
			inputnum++;
		}
		for (int i = 0; i < num.length; i++){
			System.out.println((i+1)+" 點:"+num[i]+"次");
		}
	}

}
