package _06_test_scores;

import javax.swing.JOptionPane;

public class TestScore {

	public static void main(String[] args){
		
		String sco = JOptionPane.showInputDialog("What is one test score do you have(in percents)");
		int nsco = Integer.parseInt(sco);
		if(nsco>=90) {
		JOptionPane.showMessageDialog(null, "You suck!!!");
		}else if(nsco<=91||nsco>=70) {
		JOptionPane.showMessageDialog(null, "You are OK.");
		}else {
			JOptionPane.showMessageDialog(null, "You ar GOATED!!!");
			
			
		}
	}
}
