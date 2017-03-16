package tw.org.iii;

import javax.swing.JOptionPane;

public class Lsy20170316 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("input year");
		int year = Integer.parseInt(input);
		System.out.println(year+"年");
	}

}
